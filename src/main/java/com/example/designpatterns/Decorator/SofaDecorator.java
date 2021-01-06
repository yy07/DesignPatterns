package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 14:01
 * 这里的SofaDecorator 是作为BedDecorator 和HealthCareDecorator
 * 以及可能今后会需要的更多的装饰器的父类存在的，
 * 如果没了它，BedDecorator 和HealthCareDecorator需要对sofa接口里面的所有方法进行重写，
 * 包括对具体sofa对象的引用，这样就会有大量的重复代码。
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
