package com.springCoreDemo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("Construster is : " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise basic tennis for 30 minutes";
    }
}
