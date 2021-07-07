package com.bjpowernode.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用lambda抽取方法进行调用的时候，抽取的方法的参数列表和返回值必须和接口的方法保持一致
 */
public class Test05 {
    public static void main(String[] args) {
        MyInterface8 m = Test05::doSome;
    }

    public static int doSome(int a, String b){
        System.out.println("抽取的方法。。。。。");
        return 10;

    }
}
@FunctionalInterface
interface MyInterface8 {
   int m1(int a, String b);
}