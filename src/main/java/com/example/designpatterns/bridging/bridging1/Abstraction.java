package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:40
 */
public abstract class Abstraction {

    /**
     * 持有一个实现部分的对象
     */
    protected Implementor impl;

    /**
     * 构造方法，传入一个实现部分的对象
     */
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    /**
     * 示例操作，实现一定的功能，可能需要调用实现部分的具体实现方法
     */
    public void operation() {
        impl.operationImpl();
    }

}
