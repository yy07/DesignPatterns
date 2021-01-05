package com.example.designpatterns.Proxy.cglibproxy;

public interface DocumentDao {
    // 新增文档，为了演示方便将字符串作为执行结果返回
    String add(Document document);
    // 删除文档，为了演示方便将字符串作为执行结果返回
    String delete(Document document);
}
