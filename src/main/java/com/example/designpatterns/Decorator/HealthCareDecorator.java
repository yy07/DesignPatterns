package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 14:05
 */
public class HealthCareDecorator extends SofaDecorator {
    public HealthCareDecorator(Sofa sofa) {
        super(sofa);
    }
    public void show() {
        this.getSofa().show();
        this.massage();
    }
    // 为沙发添加按摩功能
    public void massage() {
        System.out.println("可以按摩");
    }
}
