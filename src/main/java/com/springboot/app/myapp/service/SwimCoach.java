package com.springboot.app.myapp.service;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "swim 100 meters";
    }
}
