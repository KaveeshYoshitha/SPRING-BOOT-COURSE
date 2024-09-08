package com.springCoreDemo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise fast bawling for 15 minutes !!!!!!!!";
    }
}
