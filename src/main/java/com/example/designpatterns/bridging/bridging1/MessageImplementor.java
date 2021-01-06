package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:44
 */
/**
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {

    /**
     * 发送消息
     *
     * @param message 消息的内容
     * @param toUser  消息的接收人
     */
    public void send(String message, String toUser);

}
