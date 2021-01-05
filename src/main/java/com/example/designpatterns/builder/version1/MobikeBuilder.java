package com.example.designpatterns.builder.version1;

import com.example.designpatterns.builder.model.AlloyFrame;
import com.example.designpatterns.builder.model.Bike;
import com.example.designpatterns.builder.model.DermisSeat;
import com.example.designpatterns.builder.model.SolidTire;

public class MobikeBuilder extends Builder {
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new AlloyFrame());
    }
    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }
    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
