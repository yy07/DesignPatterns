package com.example.designpatterns.builder.model;

import com.example.designpatterns.builder.model.ITire;

public class SolidTire implements ITire {

    @Override
    public void tire() {
        System.out.println("实心轮胎");
    }
}
