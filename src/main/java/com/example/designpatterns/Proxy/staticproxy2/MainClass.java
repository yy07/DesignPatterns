package com.example.designpatterns.Proxy.staticproxy2;

public class MainClass {

    public static void main(String[] args) {
        // 此条语句用来测试单例ConnectionPool是否实现延迟加载
        // 由于未使用连接，此条语句不会导致数据库连接池内连接初始化
        ConnectionPool.showConnectionCount();
        System.out.println("************接下来要从连接池取连接了****************");
        IConnection connection = ConnectionPool.getInstance().getConnection();
        System.out.println("************可以使用连接进行数据库操作了****************");
        // 使用连接执行查询语句
        connection.query();
        connection.query();
        System.out.println("************连接用完了之后，该归还连接了****************");
        connection.close();
    }
}
