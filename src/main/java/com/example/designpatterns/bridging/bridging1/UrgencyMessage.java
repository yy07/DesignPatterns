package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:45
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        // 对于加急消息，在消息上添加“加急”标识，再调用父类的方法，把消息发送出去
        message = "[加急]" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的新功能：监控某消息的处理过程
     * @param message 被监控的消息
     * @return 包含监控到的数据对象，此处用Object示意
     */
    public Object watch(AbstractMessage message) {
        return null;
    }
}
