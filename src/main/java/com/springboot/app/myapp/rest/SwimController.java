package com.springboot.app.myapp.rest;

import com.springboot.app.myapp.service.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwimController {


    private Coach coach;

    public SwimController(@Qualifier("swimCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String dailyWorkOut() {
        return coach.getDailyWorkOut();
    }
}
