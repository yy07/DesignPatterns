package com.example.designpatterns.Proxy.staticproxy;

public class MainClass {

    public static void main(String[] args) {
        Subject realSubject=new RealSubject();
        Proxy proxy= new Proxy(realSubject);
        proxy.operation();
    }

}