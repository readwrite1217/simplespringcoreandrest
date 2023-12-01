package com.springboot.app.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//autoconfigure
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration

@SpringBootApplication(
        scanBasePackages = {}
)
public class DemoApp {

    public static void main(String[] args) {
        //bootstrap application
        // creates application context and registers all the beans
        //starts the embedded server tomcat etc
        SpringApplication.run(DemoApp.class, args);
    }

}
