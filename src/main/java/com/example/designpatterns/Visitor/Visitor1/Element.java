package com.example.designpatterns.Visitor.Visitor1;

public abstract class Element {

    // 接受访问者的访问
    public abstract void accept(Visitor visitor);

}