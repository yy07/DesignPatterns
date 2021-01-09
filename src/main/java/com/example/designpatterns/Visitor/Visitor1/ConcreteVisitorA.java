package com.example.designpatterns.Visitor.Visitor1;

public class ConcreteVisitorA implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        /**
         * 把访问ConcreteElementA时，需要执行的功能在这里进行实现 可能需要访问元素已有的功能，比如：operationA()
         */
        System.out.println("ConcreteVisitorA 访问 ==> ConcreteElementA 对象。");

    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        /**
         * 把访问ConcreteElementB时，需要执行的功能在这里进行实现 可能需要访问元素已有的功能，比如：operationB()
         */
        System.out.println("ConcreteVisitorA 访问 ==> ConcreteElementB 对象。");

    }

}
