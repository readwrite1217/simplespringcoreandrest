package com.springboot.app.myapp.config;

import com.springboot.app.myapp.service.Coach;
import com.springboot.app.myapp.service.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
    // make an existing 3rd party class available to Spring framework
    // the main motivation of using @Bean
}
