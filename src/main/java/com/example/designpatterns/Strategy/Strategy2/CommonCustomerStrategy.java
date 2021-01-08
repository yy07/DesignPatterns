package com.example.designpatterns.Strategy.Strategy2;

public class CommonCustomerStrategy implements DiscountStrategy {
    @Override
    public double calcPrice(double num) {
        // 普通会员没有折扣
        return num;
    }
}
