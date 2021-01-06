package com.example.designpatterns.Composite.Composite2;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 学校类
 * @Author: weixiaohuai
 * @Date: 2019/11/12
 * @Time: 20:25
 */
public class School extends SchoolOrganizationComponent {

    /**
     * 学校包含多个学院，这里使用超类SchoolOrganizationComponent替代子类College
     */
    private List<SchoolOrganizationComponent> components = new ArrayList<>();

    public School(String name) {
        super(name);
    }


    @Override
    protected void add(SchoolOrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void delete(SchoolOrganizationComponent component) {
        components.remove(component);
    }

    /**
     * 输出学校里面的所有学院
     */
    @Override
    public void print() {
        for (SchoolOrganizationComponent component : components) {
            component.print();
        }
    }

}
