package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 14:01
 */
public class SofaDecorator implements Sofa {
    // 私有的被装饰对象的引用
    private Sofa sofa;

    // 公有的获取被装饰对象的方法
    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public SofaDecorator(Sofa sofa) {
        this.sofa = sofa;
    }

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
