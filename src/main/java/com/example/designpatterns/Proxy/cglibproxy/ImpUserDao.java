package com.example.designpatterns.Proxy.cglibproxy;

public class ImpUserDao implements UserDao {
    @Override
    public String login(Long id) {
        User user = DataBase.getDataBaseInstance().getUserMap().get(id);
        if (null != user) {
            // 数据库有此用户的信息，则允许登陆...
            DataBase.getDataBaseInstance().setCurrentUser(user);
            return "用户[" + user.getName() + "]登陆成功...";
        } else {
            // 数据库没有此用户信息，则不让登陆...
            return "登陆失败，ID为\"" + id + "\"的用户不存在！";
        }
    }

    @Override
    public String logout() {
        User user = DataBase.getDataBaseInstance().getCurrentUser();
        if (null != user) {
            // 若当前有用户登陆，则退出成功...
            DataBase.getDataBaseInstance().setCurrentUser(null);
            return "用户[" + user.getName() + "]退出登陆成功...";
        } else {
            // 若当前无用户登陆，则退出失败...
            return "退出登陆失败，当前无登陆用户！";
        }
    }
}
