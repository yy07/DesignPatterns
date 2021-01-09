package com.example.designpatterns.Visitor.Visitor1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 对象结构，通常在这里对元素对象进行遍历，让访问者能够访问到所有的元素
 */
public class ObjectStructure {

    /**
     * 示意,表示对象结构，可以是一个组合结构或者集合
     */
    private Collection<Element> col = new ArrayList<Element>();

    /**
     * 示意方法，提供给客户端操作的高层接口，让访问者对对象结构中的所有元素进行访问
     */
    public void handleRequest(Visitor visitor) {
        // 循环对象结构中的元素，进行访问
        for (Element element : col) {
            element.accept(visitor);
        }
    }

    /**
     * 示意方法，组建对象结构，向对象结构中添加元素
     */
    public void addElement(Element element) {
        this.col.add(element);
    }
}
