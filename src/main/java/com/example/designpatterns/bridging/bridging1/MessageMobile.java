package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:46
 */
public class MessageMobile implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息:" + message + "给" + toUser);

    }

}
