package com.springboot.app.myapp.rest;

import com.springboot.app.myapp.service.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Marathoncontroller {

    private Coach coach;
    private Coach anotherCoach;

    public Marathoncontroller(@Qualifier("marathonCoach") Coach c, @Qualifier("marathonCoach") Coach ch) {
        this.coach = c;
        this.anotherCoach = ch;
    }

    @GetMapping("/prototype")
    public String getProtoType() {

        return String.valueOf(coach == anotherCoach);

    }

}
