package com.example.designpatterns.Composite.Composite2;


/**
 * @Description: 学院组织（组合部件）
 * @Author: weixiaohuai
 * @Date: 2019/11/12
 * @Time: 20:21
 */
public abstract class SchoolOrganizationComponent {
    /**
     * 名称
     */
    private String name;

    public SchoolOrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void add(SchoolOrganizationComponent component) {

    }

    protected void delete(SchoolOrganizationComponent component) {

    }

    public abstract void print();
}
