package com.example.designpatterns.Adapter.adapter2;

public class Client {

    public static void clientOperation(Target target) {
        target.specificOperation();
        target.otherOperation();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        clientOperation(adapter);
    }

}
