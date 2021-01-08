package com.example.designpatterns.Iterator.Iterator1;

/**
 * 聚合对象的接口，定义创建相应的迭代器对象的接口
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应的迭代器对象的接口
     */
    public abstract Iterator createIterator();
}
