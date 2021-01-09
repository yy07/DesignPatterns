package com.example.designpatterns.Mediator.Mediator1;

/**
 * 中介者，定义各个同事对象通信的接口
 */
public interface Mediator {

    /**
     * 同事对象在自身改变的时候来通知中介者的方法，让中介者负责相应的与其他同事对象的交互
     */
    public void changed(Colleague colleague);
}
