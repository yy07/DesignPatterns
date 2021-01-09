package com.example.designpatterns.Observer.Observer1;

public class ConcreteObserverA implements Observer {

    private ConcreteSubject subject;
    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(Subject subject) {
        this.subject=(ConcreteSubject)subject;
        System.out.println("观察者A中被观察对象的状态更新为："+this.subject.getState());
    }

}

