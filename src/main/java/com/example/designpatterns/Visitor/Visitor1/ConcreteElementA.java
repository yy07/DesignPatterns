package com.example.designpatterns.Visitor.Visitor1;

public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);

    }

    /**
     * 示例方法，表示元素已有的功能实现
     */
    public void operationA() {
        System.out.println("执行ConcreteElementA已有的operationA方法.");

    }
}
