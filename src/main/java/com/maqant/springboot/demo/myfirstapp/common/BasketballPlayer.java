package com.maqant.springboot.demo.myfirstapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketballPlayer implements Player{

    public BasketballPlayer() {
        System.out.println("In construction" + getClass().getSimpleName());
    }
    @Override
    public String letsPlay() {
        return "Lebron James!";
    }
}
