package com.example.designpatterns.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author:jinboxaing
 * @date:2021/1/5 14:53
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        test1();
    }


    private static  void test1(){
        String s1 = "hello";// "hello"是编译器常量， String s1是运行时，把常量地址赋值给他<br>
        String s2 = "hello";
        String s3 = "he" + "llo"; // "he" + "llo" 两个常量相加，会在编译期处理<br>
        String s4 = "hel" + new String("lo"); // "hel" "lo" new String 共建了3个空间，然后拼接起来是一个新的空间（why?）
        String s5 = new String("hello"); // s5存放的是堆中中间
        String s6 = s5.intern();  //拿到常量中的地址，
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8; //为什么这个不一样，因为是变量相加所以编译期没有做优化

        System.out.println("s1==s2:"+(s1==s2));//true
        System.out.println("s1==s3:"+(s1==s3));//true
        System.out.println("s1==s4:"+(s1==s4));//false
        System.out.println("s1==s9:"+(s1==s9));//false
        System.out.println("s4==s5:"+(s4==s5));//false
        System.out.println("s1==s6:"+(s1==s6));//true
    }



}
