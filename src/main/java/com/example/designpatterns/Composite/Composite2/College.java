package com.example.designpatterns.Composite.Composite2;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 学院类，一个学院包括多个部门
 * @Author: weixiaohuai
 * @Date: 2019/11/12
 * @Time: 20:33
 */
public class College extends SchoolOrganizationComponent {

    /**
     * 存在部门信息
     */
    private List<SchoolOrganizationComponent> components = new ArrayList<>();

    public College(String name) {
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

    @Override
    public void print() {
        for (SchoolOrganizationComponent c : components) {
            c.print();
        }
    }
}
