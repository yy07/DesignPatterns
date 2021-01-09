package com.example.designpatterns.Visitor.Visitor1;

public class Client {
    public static void main(String[] args) {

        // 创建对象结构
        ObjectStructure os = new ObjectStructure();

        // 为对象结构中添加元素对象
        os.addElement(new ConcreteElementA());
        os.addElement(new ConcreteElementB());

        // 创建访问者
        Visitor visitor = new ConcreteVisitorA();

        // 调用对象结构的业务处理方法
        os.handleRequest(visitor);
    }

}
