package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 13:59
 */
public class CommonSofa implements Sofa {
    @Override
    public void show() {
        this.sit();
        this.lie();
    }

    @Override
    public void sit() {
        System.out.println("可以坐");
    }

    @Override
    public void lie() {
        System.out.println("可以躺");
    }
}
