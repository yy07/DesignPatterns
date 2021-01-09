package com.example.designpatterns.Observer.Observer1;

public class ConcreteSubject extends Subject {
    //具体被观察者类可以具有自己的属性或状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String newState){

        this.state = newState;
        System.out.println("被观察者自身状态更新为：" + this.state);

        //状态发生改变，通知所有观察者
        this.notifyObservers(this);
    }

}
