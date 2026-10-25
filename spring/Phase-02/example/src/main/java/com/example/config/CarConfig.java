package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.main.Car;
import com.example.main.Tyre;

@Configuration
@ComponentScan(basePackages = "com.example.main")
public class CarConfig {
    @Bean
    public Car car1() {
    	Tyre tyre = new Tyre();
    	Car car = new Car(tyre);
       car.setBrand("BMW");
       return car;
    }
}
