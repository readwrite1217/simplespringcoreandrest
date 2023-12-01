package com.springboot.app.myapp.rest;

import com.springboot.app.myapp.service.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CricketController {


    private Coach coach;

    @Autowired
    // this is optional if there is only one constructor. instructs to inject dependency
    public CricketController(@Qualifier("cricketCoach") Coach theCoach) {
        coach = theCoach;
    }


    // method name necessarily doesnot need to have set - setter injection
//    @Autowired
//    public void sthg(Coach c) {
//        this.coach = c;
//
//    }

    @GetMapping("/dailyWorkOut")
    public String getDailyWorkOut() {
        return coach.getDailyWorkOut();
    }

}
