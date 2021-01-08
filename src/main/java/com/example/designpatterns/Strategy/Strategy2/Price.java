package com.example.designpatterns.Strategy.Strategy2;

public class Price {
    // 持有一个具体的策略对象
    private DiscountStrategy strategy;
    // 构造方法中传入一个具体的策略对象
    public Price(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    public double calcPrice(double num) {
        // 调用内部包含的策略对象方法计算价格
        return this.strategy.calcPrice(num);
    }
}
