package com.example.designpatterns.Visitor.Visitor2;

public class Client {

    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.addPlace(new WaterCloset());
        superMarket.addPlace(new Store());
        superMarket.addPlace(new MonitoringRoom());

        // 创建一个顾客访问者
        Visitor customer = new Customer();

        System.out.println("=====顾客来到商场=====");
        superMarket.handleRequest(customer);
        System.out.println("=====顾客离开商场=====");
        System.out.println();
        // 创建一个商场工作人员访问者
        Visitor visitor = new MarketStaff();
        System.out.println("=====工作人员来到商场=====");
        superMarket.handleRequest(visitor);
        System.out.println("=====工作人员离开商场=====");
    }

}
