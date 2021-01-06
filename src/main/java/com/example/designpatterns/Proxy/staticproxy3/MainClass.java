package com.example.designpatterns.Proxy.staticproxy3;

public class MainClass {

    public static void main(String[] args) {
        IConnection connection = new ConnectionProxy(); // 使用代理
        connection.query(); // 在真正使用时才创建真实主题对象
    }
}
