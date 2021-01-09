package com.example.designpatterns.Observer.Observer1;

public class MainClass {

    public static void main(String[] args) {

        //创建被观察者对象
        ConcreteSubject subject=new ConcreteSubject();

        //创建观察者对象
        ConcreteObserverA observerA=new ConcreteObserverA();
        ConcreteObserverB observerB=new ConcreteObserverB();

        //为被观察者对象注册观察者
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        subject.setState("复活中...");
        System.out.println();
        System.out.println("*************一千年以后...*************");
        System.out.println();
        subject.setState("疯狂杀戮中...");

    }
}
