package com.bjpowernode.reflect;

import java.lang.reflect.Type;

/**
 * 使用反射机制获取一个类的父类和接口
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class c = Class.forName("java.lang.String");
            // 2.获取父类
            Class superclass = c.getSuperclass();
            System.out.println(superclass.getName());
            // 3.获取类的实现的接口
            Class[] interfaces = c.getInterfaces();
            for (Class cl : interfaces) {
                System.out.println(cl.getName());
            }
            System.out.println("==================");
            // 4.获取类的接口（带有泛型）
            Type[] types = c.getGenericInterfaces();
            for(Type type : types){
                System.out.println(type.getTypeName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
