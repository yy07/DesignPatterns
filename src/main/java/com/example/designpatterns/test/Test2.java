package com.example.designpatterns.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 18:05
 */
public class Test2 {
    //定义MySQL的数据库驱动程序
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //定义MySQL数据库的连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/test";
    //MySQL数据库的连接用户名
    public static final String DBUSER = "root";
    //MySQL数据库的连接密码
    public static final String DBPASS = "root";
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        //数据库插入语句
        String insertSQL = "insert into user (id, name, age) values (3, 'key', 23)";
        //数据库修改语句
        String alterSQL = "update user SET name='jon' where id=8";
        //数据库删除语句
        String deleteSQL = "delete from user where id=5";
        try {
            //加载驱动程序
            Class.forName(DBDRIVER);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //连接MySQL数据库时，要写上连接的用户名和密码
            try {
                con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //实例化Statement对象
            stmt = con.createStatement();
            //执行数据库更新操作
            stmt.executeUpdate(insertSQL);
            stmt.executeUpdate(alterSQL);
            stmt.executeUpdate(deleteSQL);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(con);
        try {
            //关闭操作
            stmt.close();
            //关闭数据库
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
