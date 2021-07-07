package com.bjpowernode.reflect.classes;

/**
 * 通过反射机制创建对象
 * newInstance():创建对象是通过调用类的无参构造方法，所以通过这种方式创建对象，需要保证类中是有无参构造的。
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            // 2.创建对象
            Object o = c.newInstance();
            System.out.println(o instanceof Student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
