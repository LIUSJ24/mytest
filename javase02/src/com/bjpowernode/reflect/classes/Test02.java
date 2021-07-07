package com.bjpowernode.reflect.classes;

import java.lang.reflect.Modifier;

/**
 * Class.forName()这个方法会让类加载，类加载的时候，静态代码块开始执行，所以如果只想要执行一个类的静态代码块，
 * 不想执行其他代码的话，可以使用这种方式。
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            // 1.getModifiers()：获取类的修饰符
            int modifiers = c.getModifiers();
            String s = Modifier.toString(modifiers);
            System.out.println(s);
            // 2.getName():获取类的名称
            System.out.println(c.getName());
            // 3.getSimpleName():获取类的简称
            System.out.println(c.getSimpleName());
            // 4.getTypeName()
            System.out.println(c.getTypeName());
            // 5.isArray()
            System.out.println(c.isArray());
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
