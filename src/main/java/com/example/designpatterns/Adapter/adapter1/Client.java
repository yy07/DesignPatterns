package com.example.designpatterns.Adapter.adapter1;

public class Client {

    public static void clientOperation(Target target) {
        target.specificOperation();
        target.otherOperation();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        clientOperation(adapter);
    }
}
