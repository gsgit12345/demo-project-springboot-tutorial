package com.example.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customeOpenApi()
    {
        return new OpenAPI().components(new Components()).info(new Info().title("User-Management-Microservice").
                description("demo microservice for user management").termsOfService("www.helo.com").contact(new Contact().email("gmail.com").name("ghanshyam")

                        .name("User-Management")).version("1.0"));
    }

    @Bean
    public GroupedOpenApi v1OpenApi()
    {
        String packegToScan[]={"com.example.controller.v1version"};
        return GroupedOpenApi.builder().group("V1 version").packagesToScan(packegToScan).build();
}
    @Bean
    public GroupedOpenApi v2OpenApi()
    {
        String packegToScan[]={"com.example.controller.v2version"};
        return GroupedOpenApi.builder().group("V2 version").packagesToScan(packegToScan).build();
    }
    }

