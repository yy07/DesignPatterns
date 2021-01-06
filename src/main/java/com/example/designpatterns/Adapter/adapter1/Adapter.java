package com.example.designpatterns.Adapter.adapter1;

public class Adapter extends Adaptee implements Target {
    @Override
    public void specificOperation() {
        this.operation();
    }

    @Override
    public void otherOperation() {
        System.out.println("执行Adapter的otherOperation()方法...");
    }
}
