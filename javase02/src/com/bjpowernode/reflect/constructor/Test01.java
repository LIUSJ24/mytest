package com.bjpowernode.reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * 使用反射机制调用构造方法
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            Object o1 = c.newInstance();
            // 2.获取整个字节码中构造方法的部分
            Constructor[] cons = c.getDeclaredConstructors();
            for (Constructor con : cons) {
                System.out.println(con.getName());
                // 获取修饰符
                int mod = con.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
            // 3.调用构造方法
            Constructor con1 = c.getDeclaredConstructor();
            Object o = con1.newInstance();

            Constructor con2 = c.getDeclaredConstructor(String.class, char.class, int.class,String.class);
            Object o2 = con2.newInstance("abc", '男', 20, "1877777777");
            System.out.println(o2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
