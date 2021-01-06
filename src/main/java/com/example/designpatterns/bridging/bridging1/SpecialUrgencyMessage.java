package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:45
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(AbstractMessage message) {
        // 执行催促的功能，发出催促的信息
    }

    public void sendMessage(String message, String toUser) {
        // 对于特急消息，在消息上添加“特急”标识，再调用父类的方法，把消息发送出去
        message = "[特急]" + message;
        super.sendMessage(message, toUser);
        // 还需要增加一条待催促的信息
    }
}
