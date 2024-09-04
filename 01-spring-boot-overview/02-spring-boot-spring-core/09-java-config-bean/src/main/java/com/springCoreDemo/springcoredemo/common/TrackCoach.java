package com.springCoreDemo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("Construster is : " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5km running";
    }
}
