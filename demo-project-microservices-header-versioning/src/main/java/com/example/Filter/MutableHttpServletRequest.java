package com.example.Filter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Primary
public class MutableHttpServletRequest extends HttpServletRequestWrapper {

    private final Map<String, String> customHeaders;

    public MutableHttpServletRequest(HttpServletRequest request) {
        super(request);
        this.customHeaders = new HashMap<>();
    }

    /**
     * Exposing method to add header.
     *
     * @param name
     * @param value
     */
    public void putHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    /**
     * Method to get header.
     *
     * @param name
     * @return header
     */
    @Override
    public String getHeader(String name) {
        String headerValue = customHeaders.get(name);

        if (null != headerValue) {
            return headerValue;
        }
        return ((HttpServletRequest) getRequest()).getHeader(name);
    }

    /**
     * Method to get header names.
     * @return header names
     */
    @Override
    public Enumeration<String> getHeaderNames() {
        Set<String> headerSet = new HashSet<>(customHeaders.keySet());

        Enumeration<String> headerNames = ((HttpServletRequest) getRequest()).getHeaderNames();
        while (headerNames.hasMoreElements()) {
            headerSet.add(headerNames.nextElement());
        }
        return Collections.enumeration(headerSet);
    }
}