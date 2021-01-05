package com.example.designpatterns.builder.model;

import com.example.designpatterns.builder.model.ISeat;

public class RubberSeat implements ISeat {
    @Override
    public void seat() {
        System.out.println("橡胶坐垫");
    }
}
