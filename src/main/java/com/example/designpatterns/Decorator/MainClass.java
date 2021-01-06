package com.example.designpatterns.Decorator;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 14:05
 */
public class MainClass {
    public static void main(String[] args) { // 先创建一个要被装饰的普通沙发对象
        Sofa sofa = new SofaDecorator(new CommonSofa());
        System.out.println("**********普通沙发功能如下：***********");
        sofa.show();
        System.out.println(); // 用BedDecorator对创建好的普通沙发对象进行装饰，为其增加睡觉功能
        System.out.println("**********沙发床功能如下：***********");
        Sofa sofaBed = new BedDecorator(sofa);
        sofaBed.show();
        System.out.println(); // 用HealthCareDecorator对创建好的普通沙发对象进行装饰，为其增加按摩功能
        System.out.println("**********保健沙发功能如下：***********");
        Sofa healthCareSofa = new HealthCareDecorator(sofa);
        healthCareSofa.show();
        System.out.println(); // 用HealthCareDecorator对创建好的沙发床对象进行装饰，为其增加按摩功能
        System.out.println("**********保健沙发床功能如下：***********");
        Sofa healthCareSofaBed = new HealthCareDecorator(sofaBed);
        healthCareSofaBed.show();
    }
}
