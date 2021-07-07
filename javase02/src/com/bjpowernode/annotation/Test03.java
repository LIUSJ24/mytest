package com.bjpowernode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Date;

/**
 * JDK内置注解
 * 1.注解只在代码编译阶段是生效，用来检查代码编写是否有误，运行的时候注解是没有任何意义的。
 * 2.Override注解只能用来修饰方法
 * 3.Deprecated:用来标识内容(类、方法、属性...)已经过时，不建议使用
 * 4.SuppressWarnings：用来抑制警告信息的。
 */
// @Override
@Deprecated
//@SuppressWarnings
// @Target(ElementType.FIELD)
public class Test03 {

    public static void main(String[] args) {
        String str = "2020-10-01";
        Date date = new Date(str);

        m1();
    }

    @Override
    public String toString(){
        return "";
    }

    @Deprecated
    String name;

    @Deprecated
    public static void m1(){
        System.out.println("=========");
    }
}
