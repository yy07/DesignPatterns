package com.example.designpatterns.TemplateMethod.TemplateMethod1;

/**
 * 具体实现类，实现原语操作，并可以添加与自身功能相关的其他操作
 */
public class ConcreteClass extends AbstractClass {

    // 具体的实现
    @Override
    public void primitiveOperationA() {
        System.out.println("执行原语操作A...");
    }

    // 具体的实现
    @Override
    public void primitiveOperationB() {
        System.out.println("执行原语操作B...");
    }

}
