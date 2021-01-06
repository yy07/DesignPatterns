package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:44
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser){
        //对于普通消息，什么都不干，直接调用父类的方法，把消息发送出去
        super.sendMessage(message, toUser);
    }

}
