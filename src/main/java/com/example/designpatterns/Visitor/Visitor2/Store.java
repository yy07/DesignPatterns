package com.example.designpatterns.Visitor.Visitor2;

public class Store extends Place {

    @Override
    public void accept(Visitor visitor) {
        // 回调访问者对象的相应方法
        visitor.visitStore(this);
    }

    public void shopping() {
        // 商店已有的方法
        System.out.println("欢迎光临，祝您购物愉快。。。*/");
    }
}
