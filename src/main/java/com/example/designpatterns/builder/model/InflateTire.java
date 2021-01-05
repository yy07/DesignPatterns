package com.example.designpatterns.builder.model;

public class InflateTire implements ITire {
    @Override
    public void tire() {
        System.out.println("充气轮胎");
    }
}
