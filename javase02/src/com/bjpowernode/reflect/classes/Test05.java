package com.bjpowernode.reflect.classes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射机制调用方法
 * 1.对象
 * 2.方法名
 */
public class Test05 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            Object o = c.newInstance();

            Method m1 = c.getDeclaredMethod("m1", int.class, String.class);
            m1.setAccessible(true);
            m1.invoke(o,10,"abc");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
