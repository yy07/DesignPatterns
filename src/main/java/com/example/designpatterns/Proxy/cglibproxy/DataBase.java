package com.example.designpatterns.Proxy.cglibproxy;
/**
 * 定义一个DataBase类用来扮演数据库的功能，将数据库中的用户记录和文档记录分别存储在一个Map中
 */

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<Long, User> userMap = null;
    private static Map<Long, Document> documentMap = null;
    // 用来记录当前登陆用户信息
    private static User currentUser = null;

    private DataBase() {
        // 数据初始化，为数据库中增加几条用户记录。。。
        userMap = new HashMap<Long, User>();
        userMap.put(20160708L, new User(20160708L, "燕凌娇"));
        userMap.put(20160709L, new User(20160709L, "姬如雪"));
        userMap.put(20160710L, new User(20160710L, "百里登风"));
        // 数据初始化，为数据库中增加几条文档记录。。。
        documentMap = new HashMap<Long, Document>();
        documentMap.put(30160708L, new Document(30160708L, "C++常用算法手册"));
        documentMap.put(30160709L, new Document(30160709L, "深入理解Android内核设计思想"));
        documentMap.put(30160710L, new Document(30160710L, "Java从入门到放弃"));
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        DataBase.currentUser = currentUser;
    }

    public Map<Long, User> getUserMap() {
        return userMap;
    }

    public Map<Long, Document> getDocumentMap() {
        return documentMap;
    }

    public static DataBase getDataBaseInstance() {
        return DataBaseHolder.dataBase;
    }

    public static class DataBaseHolder {
        private static DataBase dataBase = new DataBase();
    }
}
