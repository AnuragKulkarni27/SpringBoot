package com.example.prac2;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is running currently");
    }
}

