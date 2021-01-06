package com.example.designpatterns.Composite.Composite2;


public class Client {
    public static void main(String[] args) {
        //学校
        SchoolOrganizationComponent university = new School("中山大学");

        //学院里面添加多个部门
        SchoolOrganizationComponent college1 = new College("计算机学院");
        college1.add(new Department("计算机专业"));
        college1.add(new Department("软件工程专业"));

        SchoolOrganizationComponent college2 = new College("文学院");
        college2.add(new Department("语文专业"));
        college2.add(new Department("文学专业"));

        //学校里面添加多个学院
        university.add(college1);
        university.add(college2);

        System.out.println("====" + university.getName() + "====");
        university.print();
        System.out.println("====" + college1.getName() + "====");
        college1.print();
        System.out.println("====" + college2.getName() + "====");
        college2.print();
    }
}
