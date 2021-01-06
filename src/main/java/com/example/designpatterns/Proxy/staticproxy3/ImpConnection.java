package com.example.designpatterns.Proxy.staticproxy3;

public class ImpConnection implements IConnection {

    ImpConnection() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("ImpConnection对象创建中...");
                Thread.sleep(1000);// 假设数据库连接等耗时操作
            }
            System.out.println("ImpConnection对象创建完成...");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void query() {
        System.out.println("执行一次数据库查询操作...");
    }

}
