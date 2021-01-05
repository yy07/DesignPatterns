package com.example.designpatterns.Proxy.staticproxy2;

public class ConnectionProxy implements IConnection {

    private IConnection iConnection;

    public ConnectionProxy(IConnection iConnection) {
        super();
        this.iConnection = iConnection;
    }

    @Override
    public void query() {
        //对于我们不关心的方法，直接调用真实对象去处理
        iConnection.query();
    }

    @Override
    public void close() {
        // 不真正关闭连接，而是将连接归还给连接池
        ConnectionPool.getInstance().returnConnection(iConnection);
    }

}
