package com.bjpowernode.reflect.field;

import com.bjpowernode.reflect.classes.Student;

import java.lang.reflect.Field;

/**
 * 通过反射机制获取属性的值,修改属性的值
 * 1.对象
 * 2.属性名
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            Object o = c.newInstance();
            // 2.获取属性
            Field field = c.getDeclaredField("name");
            // 将私有的属性设置为外部可见,这个方法会打破面向对象的封装特性，让私有的属性在外部也可以访问
            field.setAccessible(true);
            // 3.获取属性值
            Object o1 = field.get(o);
            System.out.println(o1);
            // 4.设置属性值
            Field gender = c.getDeclaredField("gender");
            gender.setAccessible(true);
            gender.set(o,'男');
            System.out.println(gender.get(o));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
