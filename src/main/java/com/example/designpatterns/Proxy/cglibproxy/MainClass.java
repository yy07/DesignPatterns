package com.example.designpatterns.Proxy.cglibproxy;

public class MainClass {


    public  static void main(String[] args) {
        // 创建一个CglibProxy代理类对象，用来创建子类代理实例
        CglibProxy cglib = new CglibProxy();
        // 为ImpUserDao类添加一个动态代理类对象，即子类代理对象
        UserDao userProxy = (UserDao) cglib.getProxyInstance(ImpUserDao.class);
        // 为ImpDocumentDao类添加一个动态代理类对象，即子类代理对象
        DocumentDao documentProxy = (DocumentDao) cglib.getProxyInstance(ImpDocumentDao.class);
        // 先输入一个不存在的用户Id登陆试试...
        userProxy.login(20160718L);
        documentProxy.add(new Document(30160711L, "转角遇见幸福"));
        userProxy.logout();
        // 再用一个真实用户Id登陆试试...
        userProxy.login(20160708L);
        documentProxy.add(new Document(30160711L, "转角遇见幸福"));
        userProxy.logout();
    }
}
