package com.example.designpatterns.Proxy.staticproxy2;

public class ImpConnection implements IConnection {

    @Override
    public void query() {
        System.out.println("执行一条查询语句...");
    }

    @Override
    public void close() {
        System.out.println("关闭连接...");
    }
}
