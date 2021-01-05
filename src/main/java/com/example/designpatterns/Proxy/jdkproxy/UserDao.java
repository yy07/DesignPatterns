package com.example.designpatterns.Proxy.jdkproxy;

public interface UserDao {
    // 登陆数据库，为了演示方便将字符串作为执行结果返回
    String login(Long id);
    // 退出数据库，为了演示方便将字符串作为执行结果返回
    String logout();
}
