package com.example.designpatterns.Strategy.Strategy2;

public class MainClass {
    public static void main(String[] args) {
        // 商品原价
        double num = 200;
        // 普通顾客策略计算折后价格
        Price price = new Price(new CommonCustomerStrategy());
        double newPrice = price.calcPrice(num);
        System.out.println("普通顾客购买该商品的折后价格是：" + newPrice);

        // 普通会员策略计算折后价格
        price = new Price(new CommonMemberStrategy());
        newPrice = price.calcPrice(num);
        System.out.println("普通会员购买该商品的折后价格是：" + newPrice);

        // VIP会员策略计算折后价格
        price = new Price(new VipMemberStrategy());
        newPrice = price.calcPrice(num);
        System.out.println("VIP会员购买该商品的折后价格是：" + newPrice);
    }
}
