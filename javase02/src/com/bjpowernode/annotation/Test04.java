package com.bjpowernode.annotation;

import java.lang.annotation.Native;

@MyAnnotation5
public class Test04 {

    @Native
    String name;

    @MyAnnotation5
    public static void main(String[] args) {
        try {
            // 通过反射机制获取注解
            Class c = Class.forName("com.bjpowernode.annotation.Test04");
            boolean b = c.isAnnotationPresent(MyAnnotation5.class);
            System.out.println(b);

            // 通过反射机制来获取Men这个中是否有注解
            Class c1 = Class.forName("com.bjpowernode.annotation.Men");
            boolean b1 = c1.isAnnotationPresent(MyAnnotation5.class);
            System.out.println(b1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

@MyAnnotation5
class Person {

}
class Men extends Person {

}