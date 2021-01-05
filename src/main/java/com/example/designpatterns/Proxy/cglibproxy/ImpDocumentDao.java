package com.example.designpatterns.Proxy.cglibproxy;

public class ImpDocumentDao implements DocumentDao {
    @Override
    public String add(Document document) {
        User user = DataBase.getDataBaseInstance().getCurrentUser();
        if (null == user) {
            // 若当前用户未登陆，则新增文档失败...
            return "保存失败，未获取到登陆信息！";
        } else {
            Document dbDocument = DataBase.getDataBaseInstance().getDocumentMap().get(document.getId());
            if (null != dbDocument) {
                // 若数据库中已经存在该ID的文档，则新增文档失败...
                return "添加文档《" + document.getTitle() + "》失败，文档已存在！";
            } else {
                // 若该ID的文档在数据库不存在，则新增文档成功...
                DataBase.getDataBaseInstance().getDocumentMap().put(document.getId(), document);
                return "添加文档《" + document.getTitle() + "》成功...";
            }
        }
    }

    @Override
    public String delete(Document document) {
        User user = DataBase.getDataBaseInstance().getCurrentUser();
        if (null == user) {
            // 若当前用户未登陆，则新增文档失败...
            return "保存失败，未获取到登陆信息！";
        } else {
            Document dbDocument = DataBase.getDataBaseInstance().getDocumentMap().get(document.getId());
            if (null == dbDocument) {
                // 若数据库中该文档不存在，则删除文档失败...
                return "删除文档《" + document.getTitle() + "》失败，文档不存在！";
            } else {
                // 若数据库中该文档存在，则删除文档成功...
                DataBase.getDataBaseInstance().getDocumentMap().remove(document.getId());
                return "删除文档《" + document.getTitle() + "》成功...";
            }
        }
    }
}
