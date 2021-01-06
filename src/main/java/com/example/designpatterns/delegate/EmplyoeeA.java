package com.example.designpatterns.delegate;

public class EmplyoeeA implements IEployee {
    private String cando = "编程";
    @Override
    public void doing(String task) {
        System.out.println(cando);
    }
}
