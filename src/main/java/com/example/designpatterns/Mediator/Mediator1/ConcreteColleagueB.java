package com.example.designpatterns.Mediator.Mediator1;

/**
 * 具体的同事类B
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator){
        super(mediator);
    }

    public void someOperation(){
        //在需要跟其他同事通信的时候，通知中介者对象
        getMediator().changed(this);
    }
}
