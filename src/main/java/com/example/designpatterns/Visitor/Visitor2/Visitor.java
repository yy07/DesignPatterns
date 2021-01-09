package com.example.designpatterns.Visitor.Visitor2;

public interface Visitor {

    // 进入卫生间
    public void visitWaterCloset(WaterCloset wc);

    // 进入监控室
    public void visitMonitoringRoom(MonitoringRoom mr);

    // 进入商店
    public void visitStore(Store store);

}
