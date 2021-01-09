package com.example.designpatterns.Visitor.Visitor2;

public class MonitoringRoom extends Place {

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象的相应方法
        visitor.visitMonitoringRoom(this);
    }

    public void watching() {
        // 监控室已有的方法
        System.out.println("查看监控录像...*/");
    }

}
