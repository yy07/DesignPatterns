package com.example.designpatterns.Strategy.Strategy2;

public interface DiscountStrategy {
    /**
     * 计算打折后的价格
     *
     * @param num
     *            商品原价
     * @return 折后价格
     */
    public double calcPrice(double num);
}
