package com.maqant.springboot.demo.myfirstapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballPlayer implements Player{

    public FootballPlayer() {
        System.out.println("In construction" + getClass().getSimpleName());
    }
    @Override
    public String letsPlay() {
        return "Cristiano Ronaldo!";
    }
}
