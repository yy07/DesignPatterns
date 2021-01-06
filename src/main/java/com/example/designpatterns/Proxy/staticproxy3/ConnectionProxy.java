package com.example.designpatterns.Proxy.staticproxy3;

public class ConnectionProxy implements IConnection {

    private ImpConnection connection = null;

    @Override
    public void query() {
        // 在真正需要的时候才能创建真实对象，创建过程可能很慢
        if (connection == null) {
            connection = new ImpConnection();
        }
        connection.query();
    }
}
