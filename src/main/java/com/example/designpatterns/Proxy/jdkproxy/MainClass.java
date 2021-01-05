package com.example.designpatterns.Proxy.jdkproxy;

import java.lang.reflect.Proxy;

public class MainClass {
    public static void main(String[] args) {
        // 此处来创建了两个动态代理类对象...
        UserDao userDao = new ImpUserDao();
        DataBaseLogHandler userHandler = new DataBaseLogHandler(userDao);
        UserDao userProxy = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),
                new Class[] { UserDao.class }, userHandler);
        DocumentDao doucumentDao = new ImpDocumentDao();
        DataBaseLogHandler documentHandler = new DataBaseLogHandler(doucumentDao);
        DocumentDao documentProxy = (DocumentDao) Proxy.newProxyInstance(DocumentDao.class.getClassLoader(),
                new Class[] { DocumentDao.class }, documentHandler);
        // 先输入一个不存在的用户Id登陆试试...
        userProxy.login(20160718L);
        documentProxy.add(new Document(30160711L, "转角遇见幸福"));
        userProxy.logout();
        // 再用一个真实用户Id登陆试试...
        userProxy.login(20160708L);
        documentProxy.add(new Document(30160711L, "转角遇见幸福"));
//        documentProxy.add(new Document(30160711L, "转角遇见幸福"));
        userProxy.logout();
    }
}
