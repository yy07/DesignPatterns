package com.example.designpatterns.builder.model;

public class DermisSeat implements ISeat {
    @Override
    public void seat() {
        System.out.println("真皮座椅");
    }
}
