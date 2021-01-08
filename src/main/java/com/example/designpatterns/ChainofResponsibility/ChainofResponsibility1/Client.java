package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility1;

public class Client {

    public static void main(String[] args) {
        // 组装职责链
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setSuccessor(handlerB);
        // 提交请求
        handlerA.handleRequest();
    }

}
