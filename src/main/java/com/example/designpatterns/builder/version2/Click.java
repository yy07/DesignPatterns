package com.example.designpatterns.builder.version2;


public class Click {
    public static void main(String[] args) {
        // 非 Builder 模式 
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        System.out.println(computer);
        // Builder 模式 
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
        System.out.println(newComputer);
    }

} 
