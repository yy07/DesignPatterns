package com.example.designpatterns.Proxy.staticproxy;

public class RealSubject implements Subject {

    //实现了抽象主题角色定义的接口
    @Override
    public void operation() {
        System.out.println("调用真实主题对象执行操作进行中...");
    }

}
