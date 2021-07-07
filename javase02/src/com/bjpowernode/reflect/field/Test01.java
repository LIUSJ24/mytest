package com.bjpowernode.reflect.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制操作属性（获取属性值、修改属性值）
 * 1.获取属性的声明
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.获取整个字节码Class
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            // 2.获取整个字节码中属性的部分
            // getFields（）方法获取的属性只能是public修改的
            Field[] fields = c.getFields();
            System.out.println(fields.length);
            Field f = fields[0];
            System.out.println(f.getName());
            // 这个方法获取的是所有的属性，包括所有修饰符
            Field[] deFields = c.getDeclaredFields();
            for (Field field : deFields) {
                // 获取属性的名称
                System.out.println(field.getName());
                // 获取属性的类型
                Class type = field.getType();
                System.out.println(type.getName());
                // 获取属性的修饰符
                int mod = field.getModifiers();
                String s = Modifier.toString(mod);
                System.out.println(s);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
