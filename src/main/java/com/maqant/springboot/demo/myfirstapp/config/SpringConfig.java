package com.maqant.springboot.demo.myfirstapp.config;

import com.maqant.springboot.demo.myfirstapp.common.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SpringConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable();
        return http.build();
    }
    @Bean
    public Coach alexFerguson() {
        return new FootballCoach();
    }

    @Bean
    public Coach obradovic() {
        return new BasketballCoach();
    }

    @Bean
    public Coach shaqOneill() {
        return new BasketballCoach();
    }

    @Bean
    public Player ronaldo() {
        return new FootballPlayer();
    }

    @Bean
    public Player lebron() {
        return new BasketballPlayer();
    }
}
