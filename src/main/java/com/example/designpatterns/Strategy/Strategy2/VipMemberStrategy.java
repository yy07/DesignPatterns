package com.example.designpatterns.Strategy.Strategy2;

public class VipMemberStrategy implements DiscountStrategy {
    @Override
    public double calcPrice(double num) {
        // 普通会员9.0折
        return num * 0.9;
    }
}
