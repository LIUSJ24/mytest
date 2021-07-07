package com.bjpowernode.reflect.classes;

import java.util.ResourceBundle;

/**
 * 使用反射机制动态创建对象
 */
public class Test04 {
    public static void main(String[] args) {
        // 1.从配置文件中读取要创建的对象的类名
        ResourceBundle bundle = ResourceBundle.getBundle("com/bjpowernode/reflect/classes/classinfo");
        String className = bundle.getString("className");
        System.out.println(className);
        try {
            // 2.通过反射机制创建对象
            Class c = Class.forName(className);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
