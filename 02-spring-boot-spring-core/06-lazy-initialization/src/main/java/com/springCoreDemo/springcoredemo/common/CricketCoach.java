package com.springCoreDemo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Construster is : " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bawling for 15 minutes =>";
    }
}
