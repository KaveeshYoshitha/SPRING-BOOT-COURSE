package com.springCoreDemo.springcoredemo.config;

import com.springCoreDemo.springcoredemo.common.Coach;
import com.springCoreDemo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach SwimCoach(){
        return new SwimCoach();
    }

}
