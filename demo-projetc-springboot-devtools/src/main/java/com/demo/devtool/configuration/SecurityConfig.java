package com.demo.devtool.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class SecurityConfig {
    SecurityConfig()
    {
        System.out.println("security configuration module ");
    }

   // @Component  --applicable on class only
    public Student create()
    {
        return new Student();
    }
}
