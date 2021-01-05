package com.example.designpatterns.Proxy.staticproxy2;

public interface IConnection {

    // 执行一条查询语句
    void query();

    // 关闭连接
    void close();
}
