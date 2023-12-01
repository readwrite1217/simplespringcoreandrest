package com.springboot.app.myapp.service;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void setup() {
        System.out.println("In setup: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "take 5 wickets";
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("In preDestroy: " + getClass().getSimpleName());

    }
}
