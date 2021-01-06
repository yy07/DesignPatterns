package com.example.designpatterns.Adapter.adapter2;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void specificOperation() {
        this.adaptee.operation();
    }

    @Override
    public void otherOperation() {
        System.out.println("执行Adapter的otherOperation()方法...");
    }
}
