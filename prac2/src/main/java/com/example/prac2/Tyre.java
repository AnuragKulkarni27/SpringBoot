package com.example.prac2;

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
        return "Tyre is of "+brand;
    }
}
