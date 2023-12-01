package com.springboot.app.myapp.rest;

import com.springboot.app.myapp.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SoccerCoachController {


    private final Coach coach;

    @Autowired  // this is optional if there is only one constructor. instructs to inject dependency
    public SoccerCoachController(@Qualifier("soccerCoach") Coach theCoach) {
        coach = theCoach;
    }

    @GetMapping("/dailyWorkOut11")
    public String getDailyWorkOut() {
        return coach.getDailyWorkOut();
    }
}
