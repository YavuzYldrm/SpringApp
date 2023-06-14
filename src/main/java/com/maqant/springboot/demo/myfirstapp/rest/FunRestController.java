package com.maqant.springboot.demo.myfirstapp.rest;

import com.maqant.springboot.demo.myfirstapp.common.Coach;
import com.maqant.springboot.demo.myfirstapp.common.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

    private Coach myCoach;
    private Coach myCoach2;
    private Coach myCoach3;

    private Player myPlayer;

    private Player myPlayer2;

    // expose "/" that return "Hello World"

    //define cons dependency Injection
    @Autowired
    @Qualifier("alexFerguson")
    public void FootballController(Coach theCoach) {
        myCoach = theCoach;
    }

    @Autowired
    public void BasketballController(
            @Qualifier("obradovic") Coach theCoach,
            @Qualifier("shaqOneill") Coach otherCoach) {
        myCoach2 = theCoach;
        myCoach3 = otherCoach;
    }

    @Autowired
    @Qualifier("lebron")
    public void setBasketballPlayer(Player basketballPlayer) {
        myPlayer = basketballPlayer;
    }

    @Autowired
    @Qualifier("ronaldo")
    public void setFootballPlayer(Player footballPlayer) {myPlayer2 = footballPlayer;}

    @Value("${yavuz.name}")
    public String name;

    @GetMapping("/")
    public String sayHello() {
        return name;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run! Hell!";
    }

    @GetMapping("/footballCoach")
    public String getFootballCoach() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/basketCoach")
    public String getBasketCoach() {
        return myCoach2.getDailyWorkout();
    }

    @GetMapping("/basketPlayer")
    public String getBasketPlayer() {return myPlayer.letsPlay();}

    @GetMapping("/footballPlayer")
    public String getFootballPlayer() {return myPlayer2.letsPlay();}

    @GetMapping("/basketCoachCheck")
    public String checkBasketPlayer() {return "Comparing beans : " + (myCoach2 == myCoach3);}
}
