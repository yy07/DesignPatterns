package com.example.designpatterns.Visitor.Visitor1;

/**
 * 访问者接口
 */
public interface Visitor {

    /**
     * 访问ConcreteElementA，相当于为ConcreteElementA添加的新功能
     */
    public void visitConcreteElementA(ConcreteElementA elementA);

    /**
     * 访问ConcreteElementB，相当于为ConcreteElementB添加的新功能
     */
    public void visitConcreteElementB(ConcreteElementB elementB);

}
