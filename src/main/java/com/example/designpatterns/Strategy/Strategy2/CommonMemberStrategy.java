package com.example.designpatterns.Strategy.Strategy2;

public class CommonMemberStrategy implements DiscountStrategy {
    @Override
    public double calcPrice(double num) {
        // 普通会员9.5折
        return num * 0.95;
    }
}
