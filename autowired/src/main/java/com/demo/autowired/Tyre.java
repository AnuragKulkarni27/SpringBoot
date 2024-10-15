package com.demo.autowired;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    @Override
    public String toString(){
        return "Is running";
    }
}
