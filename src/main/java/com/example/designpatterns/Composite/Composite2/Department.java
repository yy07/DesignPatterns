package com.example.designpatterns.Composite.Composite2;


public class Department extends SchoolOrganizationComponent {

    public Department(String name) {
        super(name);
    }

    @Override
    protected void add(SchoolOrganizationComponent component) {
        System.out.println("不支持该方法...");
    }

    @Override
    protected void delete(SchoolOrganizationComponent component) {
        System.out.println("不支持该方法...");
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

}
