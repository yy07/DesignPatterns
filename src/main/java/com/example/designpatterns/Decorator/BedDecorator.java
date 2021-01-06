package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 14:04
 */
public class BedDecorator extends SofaDecorator {
    public BedDecorator(Sofa sofa) {
        super(sofa);
    }

    public void show() {
        this.getSofa().show();
        this.sleep();
    } // 为沙发添加睡觉功能

    public void sleep() {
        System.out.println("可以睡觉");
    }
}
