package com.example.designpatterns.Visitor.Visitor2;

public class Customer implements Visitor {

    @Override
    public void visitWaterCloset(WaterCloset wc) {
        System.out.println("/*顾客来到卫生间。。。");
        wc.washing();
        System.out.println();

    }

    @Override
    public void visitMonitoringRoom(MonitoringRoom mr) {
        System.out.println("/*顾客来到监控室。。。");
        System.out.println("非工作人员禁止入内。。。*/");
        System.out.println();

    }

    @Override
    public void visitStore(Store store) {
        System.out.println("/*顾客来到商店。。。");
        store.shopping();
        System.out.println();
    }

}
