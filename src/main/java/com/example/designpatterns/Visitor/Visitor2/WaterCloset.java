package com.example.designpatterns.Visitor.Visitor2;

public class WaterCloset extends Place {

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象的相应方法
        visitor.visitWaterCloset(this);
    }

    public void washing() {
        // 卫生间已有的方法
        System.out.println("洗洗手。。。*/");
    }
}
