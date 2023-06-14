package com.maqant.springboot.demo.myfirstapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FootballCoach implements Coach {

    //define our init method
    @PostConstruct
    public void postFunction() {
        System.out.println("***********************In POST CONSTRUCTION function  - Init Method" + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("************************In PRE DESTROY function " + getClass().getSimpleName());
    }

    //define our destroy method

    public FootballCoach() {
        System.out.println("In construction" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Alex Ferguson!";
    }
}
