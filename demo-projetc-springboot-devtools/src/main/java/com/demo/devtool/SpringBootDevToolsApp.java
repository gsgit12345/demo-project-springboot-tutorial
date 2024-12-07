package com.demo.devtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
//@SpringBootApplication
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
public class SpringBootDevToolsApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDevToolsApp.class,args);
        System.out.println("Hello World!");
    }
}
