package com.example.designpatterns.Adapter.adapter1;

public interface Target {
    // Adaptee适配者有此方法的实现，但方法名可以不同
    void specificOperation();

    // Adaptee适配者没有的其他方法
    void otherOperation();
}
