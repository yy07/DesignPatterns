package com.example.designpatterns.builder.version1;

import com.example.designpatterns.builder.model.Bike;
import com.example.designpatterns.builder.model.CarbonFrame;
import com.example.designpatterns.builder.model.InflateTire;
import com.example.designpatterns.builder.model.RubberSeat;

public class OfoBuilder extends Builder {
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new CarbonFrame());
    }
    @Override
    void buildSeat() {
        mBike.setSeat(new RubberSeat());
    }
    @Override
    void buildTire() {
        mBike.setTire(new InflateTire());
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
