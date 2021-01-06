package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:44
 */
/**
 * 抽象的消息对象
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * @param message 消息的内容
     * @param toUser  消息的接收人
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
