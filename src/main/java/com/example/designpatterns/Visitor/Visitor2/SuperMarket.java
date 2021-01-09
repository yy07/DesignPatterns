package com.example.designpatterns.Visitor.Visitor2;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarket {

    // 示意,表示对象结构，可以是一个组合结构或者集合
    private Collection<Place> col = new ArrayList<Place>();

    public void handleRequest(Visitor visitor) {
        // 循环对象结构中的元素，进行访问
        for (Place place : col) {
            place.accept(visitor);
        }
    }

    // 示意方法，组建对象结构，向对象结构中添加元素
    public void addPlace(Place place) {
        this.col.add(place);
    }
}