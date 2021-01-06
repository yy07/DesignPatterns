package com.example.designpatterns.bridging.bridging1;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:48
 */
public class Client {

    public static void main(String[] args) {
        // 创建具体的实现对象
        MessageImplementor impl = new MessageSMS();

        // 创建一个普通消息对象
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("今晚8点，时代广场，不见不散！", "小乔");

        // 创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("半小时后召开紧急会议！", "小周");

        // 创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("领导过来视察了，速回！", "小明");

        // 把发送方式切换成手机短消息，将以上内容重发一遍
        impl = new MessageMobile();

        // 创建一个普通消息对象
        m = new CommonMessage(impl);
        m.sendMessage("今晚8点，时代广场，不见不散！", "小乔");

        // 创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("半小时后召开紧急会议！", "小周");

        // 创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("领导过来视察了，速回！", "小明");

    }

}
