package com.example.designpatterns.delegate;

public class Boss {
    public static void doing(String task,Leader leader){
        leader.doing(task);
    }

    public static void main(String[] args) {
        doing("编程",new Leader());
    }
}
