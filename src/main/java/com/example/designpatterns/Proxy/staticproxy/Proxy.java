package com.example.designpatterns.Proxy.staticproxy;

public class Proxy implements Subject {

    //包含一个真实主题对象的引用
    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    public void before() {
        System.out.println("调用真实主题对象之前进行的相关操作...");
    }

    public void after() {
        System.out.println("调用真实主题对象之后进行的相关操作...");
    }

    //通过调用内部真实主题对象的引用实现了抽象主题角色定义的接口，并添加了一些额外处理功能
    @Override
    public void operation() {
        before();
        realSubject.operation();
        after();
    }

}
