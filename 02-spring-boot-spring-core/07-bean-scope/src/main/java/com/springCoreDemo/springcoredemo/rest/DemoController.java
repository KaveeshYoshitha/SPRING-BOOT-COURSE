package com.springCoreDemo.springcoredemo.rest;

import com.springCoreDemo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach theCoach,
                         @Qualifier("cricketCoach") Coach theAnotherCoach) {

        System.out.println("Construster is : " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans : myCoach==anotherCoach, " + (myCoach == anotherCoach);
    }
}