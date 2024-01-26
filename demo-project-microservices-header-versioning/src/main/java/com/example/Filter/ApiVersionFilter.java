package com.example.Filter;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
public class ApiVersionFilter implements Filter {

    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = ((HttpServletRequest) request);
        httpRequest.setAttribute("X-Accept-Version",  httpRequest.getHeader("X-Accept-Version"));
        httpRequest.setAttribute("X-Api-Version", httpRequest.getHeader("X-Accept-Version"));
        if (null == httpRequest.getHeader("X-Accept-Version")) {
            Set<String> availableVersions = new TreeSet<>();
            requestMappingHandlerMapping.getHandlerMethods().forEach((requestMappingInfo, handlerMethod) -> {
                if (null != requestMappingInfo.getPatternsCondition().getMatchingCondition(httpRequest)
                        && null != requestMappingInfo.getMethodsCondition().getMatchingCondition(httpRequest)
                        && null != requestMappingInfo.getParamsCondition().getMatchingCondition(httpRequest)
                        && null != requestMappingInfo.getConsumesCondition().getMatchingCondition(httpRequest)
                        && null != requestMappingInfo.getProducesCondition().getMatchingCondition(httpRequest)) {
                    requestMappingInfo.getHeadersCondition().getExpressions().forEach(header -> {
                        if (header.getName().equals("X-Accept-Version")) {
                            availableVersions.add(header.getValue());
                        }
                    });
                }
            });
            Optional<String> latestVersion = ((TreeSet<String>)availableVersions).descendingSet().stream().findFirst();
            if(latestVersion.isPresent()) {
                MutableHttpServletRequest mutableRequest = new MutableHttpServletRequest(httpRequest);
                mutableRequest.putHeader("X-Accept-Version",latestVersion.get());
                mutableRequest.setAttribute("X-Api-Version", mutableRequest.getHeader("X-Accept-Version"));
                request = mutableRequest;
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}