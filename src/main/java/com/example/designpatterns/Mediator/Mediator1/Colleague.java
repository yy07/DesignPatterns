package com.example.designpatterns.Mediator.Mediator1;

/**
 * 同事类的抽象父类
 */
public abstract class Colleague {

    /**
     * 持有中介者对象，每一个同事类都知道它的中介者对象
     */
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取当前同事类对应的中介者对象
     */
    public Mediator getMediator() {
        return mediator;
    }
}
