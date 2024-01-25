package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootActuatorDemo
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootActuatorDemo.class,args);
        System.out.println( "Hello World!" );
    }
}
