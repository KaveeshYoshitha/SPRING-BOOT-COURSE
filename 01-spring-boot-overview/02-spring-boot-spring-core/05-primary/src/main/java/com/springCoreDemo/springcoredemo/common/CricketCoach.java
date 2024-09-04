package com.springCoreDemo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise fast bawling for 15 minutes =>";
    }
}
