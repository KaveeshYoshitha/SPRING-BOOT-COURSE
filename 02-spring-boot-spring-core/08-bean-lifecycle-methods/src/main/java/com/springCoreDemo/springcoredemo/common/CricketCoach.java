package com.springCoreDemo.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Construster is : " +getClass().getSimpleName());
    }

    //Define out init methods
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
    }

    //Define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practise fast bawling for 15 minutes =>";
    }
}
