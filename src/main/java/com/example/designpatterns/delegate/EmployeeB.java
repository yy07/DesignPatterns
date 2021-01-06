package com.example.designpatterns.delegate;

public class EmployeeB implements IEployee {
    private String cando = "写字";
    @Override
    public void doing(String task) {
        System.out.println(cando);
    }
}
