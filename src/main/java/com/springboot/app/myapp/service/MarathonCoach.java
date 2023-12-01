package com.springboot.app.myapp.service;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarathonCoach implements Coach {
    public MarathonCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "run 5k daily";
    }
}
