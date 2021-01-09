package com.example.designpatterns.Observer.Observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    //用来保存注册过的观察者
    private List<Observer> observers=new ArrayList<Observer>();
    //注册一个观察者
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    //删除一个观察者
    public void unregisterObserver(Observer observer){
        this.observers.remove(observer);
    }
    //通知所有观察者进行状态更新
    public void notifyObservers(Subject subject){
        for(Observer o:observers){
            o.update(subject);
        }
    }
}
