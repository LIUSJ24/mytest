package com.bjpowernode.annotation;

import java.util.List;

/**
 * 注解类中可以定义什么内容？
 * 1.可以定义属性：语法格式：属性类型 属性名称()
 * 2.注解类中属性的类型有限制：8种基本数据类型、String、Class、枚举类和以上类型对应的数组都可以作为类型。
 */
public @interface MyAnnotation2 {
    int age();
    double pi();
    // 定义属性，并且给属性赋值
    int a() default 10;

    // 8种基本数据类型可以作为注解类的属性类型
    byte b();
    short s();
    int i();
    long l();
    float f();
    double d();
    boolean bl();
    char c();

    // 包装类不能作为注解类的属性类型
    // Integer in();
    String str();
    Class cs();
    // MI mi();
    // Object obj();
    MyEnum me();

    // List list();

    byte[] bs();
    int[] is();
    String[] strs();
    Class[] css();
    MyEnum[] mes();

}
