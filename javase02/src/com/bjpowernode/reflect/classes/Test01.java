package com.bjpowernode.reflect.classes;

import java.util.Date;

/**
 * 获取Class对象：3种方式可以获取
 * 1.Class类下的静态方法叫做forName(),方法的参数是要操作的类的类名（类的全路径名称）;
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.获取Student类的整个字节码（Class对象）
            Class c1 = Class.forName("com.bjpowernode.reflect.classes.Student");
            Class c2 = Class.forName("java.lang.String");
            Class c3 = Class.forName("java.util.Date");

            // 2.任何的java对象，都有一个getClass()方法
            String str = "abc";
            Class c4 = str.getClass();
            Date date = new Date();
            Class c5 = date.getClass();

            System.out.println(c2 == c4);   // true
            System.out.println(c3 == c5);   // true

            // 3.java中的任何数据类型（包括基本类型）,多有一个属性class
            Class c6 = int.class;
            Class c7 = double.class;
            Class c8 = Integer.class;
            Class c9 = String.class;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
