package com.example.prac;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is running currently");
    }
}
