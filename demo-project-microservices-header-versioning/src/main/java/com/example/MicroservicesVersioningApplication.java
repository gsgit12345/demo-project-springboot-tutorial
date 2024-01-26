package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class MicroservicesVersioningApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MicroservicesVersioningApplication.class,args);
        System.out.println( "Hello World!" );
    }
}
