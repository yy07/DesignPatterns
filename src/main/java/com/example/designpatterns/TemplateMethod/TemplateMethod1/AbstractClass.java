package com.example.designpatterns.TemplateMethod.TemplateMethod1;

public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        // 调用原语操作和通用操作
        generalOperation();
        primitiveOperationA();
        primitiveOperationB();

    }

    // 原语操作A，算法中的必要步骤，父类无法确定如何真正实现，需要子类来实现
    public abstract void primitiveOperationA();

    // 原语操作B，算法中的必要步骤，父类无法确定如何真正实现，需要子类来实现
    public abstract void primitiveOperationB();

    protected void generalOperation() {
        System.out.println("执行通用操作...");
    }
}
