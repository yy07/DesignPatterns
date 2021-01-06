package com.example.designpatterns.bridging.bridging2;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:42
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("这是桥接002号机");
    }

}
