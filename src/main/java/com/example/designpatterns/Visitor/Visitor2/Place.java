package com.example.designpatterns.Visitor.Visitor2;

public abstract class Place {

    // 接受访问者的访问
    public abstract void accept(Visitor visitor);
}
