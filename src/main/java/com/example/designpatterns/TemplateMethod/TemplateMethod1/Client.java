package com.example.designpatterns.TemplateMethod.TemplateMethod1;

public class Client {

    public static void main(String[] args) {
        // 创建一个模板实例
        AbstractClass abstractClass = new ConcreteClass();

        // 执行实例的模板方法
        abstractClass.templateMethod();
    }
}
