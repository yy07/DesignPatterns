package com.example.designpatterns.builder.version1;

import com.example.designpatterns.builder.model.Bike;

// 抽象 builder 类
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();
}
