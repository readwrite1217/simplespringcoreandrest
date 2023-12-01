package com.springboot.app.myapp.service;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
    public SoccerCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "score 5 goals";
    }
}
