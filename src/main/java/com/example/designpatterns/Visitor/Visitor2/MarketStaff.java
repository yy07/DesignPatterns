package com.example.designpatterns.Visitor.Visitor2;

public class MarketStaff implements Visitor {

    @Override
    public void visitWaterCloset(WaterCloset wc) {
        System.out.println("/*工作人员来到卫生间。。。");
        wc.washing();
        System.out.println();
    }

    @Override
    public void visitMonitoringRoom(MonitoringRoom mr) {
        System.out.println("/*工作人员来到监控室。。。");
        mr.watching();
        System.out.println();

    }

    @Override
    public void visitStore(Store store) {
        System.out.println("/*工作人员来到商店。。。");
        System.out.println("现在是工作时间，请专心工作。。。*/");
        System.out.println();

    }

}