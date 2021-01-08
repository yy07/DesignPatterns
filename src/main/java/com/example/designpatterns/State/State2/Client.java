package com.example.designpatterns.State.State2;

public class Client {

    public static void main(String[] args) {
        // 创建一个投票管理对象实例
        VoteManager vm = new VoteManager();

        // 通过一个循环操作来模仿用户连续投票9次的行为
        for (int i = 0; i < 9; i++) {
            vm.vote("u1", "A");
        }
    }

}
