package com.example.designpatterns.Visitor.Visitor1;


public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象的相应方法
        visitor.visitConcreteElementB(this);

    }

    /**
     * 示例方法，表示元素已有的功能实现
     */
    public void operationB() {
        System.out.println("执行ConcreteElementB已有的operationB方法.");

    }
}





