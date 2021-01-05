package com.example.designpatterns.Proxy.staticproxy2;

import java.util.LinkedList;

public class ConnectionPool {

    private static LinkedList<IConnection> connectionList = new LinkedList<IConnection>();
    private static IConnection createNewConnection() {
        return new ImpConnection();
    }

    private ConnectionPool() {
        if (connectionList == null || connectionList.size() == 0) {
            for (int i = 0; i < 10;) {
                System.out.println("创建第 " + (++i) + " 个连接...");
                connectionList.add(createNewConnection());
            }
            System.out.println("连接池初始化完成...");
            showConnectionCount();
        }
    }

    public static void showConnectionCount() {
        System.out.println("当前连接池可用连接数为： " + connectionList.size());
    }

    public IConnection getConnection() {
        if (connectionList.size() > 0) {
            // return connectionList.remove();
            // 这是原有的方式，直接返回连接，这样可能会出现程序员把连接给关闭掉的情况
            // 下面是使用代理的方式，程序员再调用close时，就会调用代理的close()方法把连接归还到连接池
            IConnection iConnection = null;
            iConnection = connectionList.remove();
            System.out.println("从连接池获取一条连接...");
            showConnectionCount();
            return new ConnectionProxy(iConnection);
        }
        return null;
    }

    public void returnConnection(IConnection connection) {
        System.out.println("将连接归还给连接池。。。");
        connectionList.add(connection);
        showConnectionCount();
    }

    public static ConnectionPool getInstance() {
        return ConnectionPoolInstance.connectionPool;
    }

    private static class ConnectionPoolInstance {
        private static ConnectionPool connectionPool = new ConnectionPool();
    }

}
