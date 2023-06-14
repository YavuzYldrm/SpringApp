package com.maqant.springboot.demo.myfirstapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("In construction" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Obradovic!";
    }
}
