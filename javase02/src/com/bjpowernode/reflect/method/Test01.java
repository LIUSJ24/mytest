package com.bjpowernode.reflect.method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 使用反射机制操作方法（获取方法的声明，方法的调用）
 * 1.方法的声明
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class c = Class.forName("com.bjpowernode.reflect.classes.Student");
            // 2.获取整个字节码中的方法部分
            Method[] deMethods = c.getDeclaredMethods();
            for (Method m : deMethods) {
                // 获取方法的名称
                System.out.println(m.getName());
                // 获取方法的返回值类型
                Class returnType = m.getReturnType();
                System.out.println(returnType.getName());
                // 获取修饰符
                int mod = m.getModifiers();
                System.out.println(Modifier.toString(mod));
                // 获取参数列表
                int count = m.getParameterCount();
                System.out.println(count);
                Class[] parameterTypes = m.getParameterTypes();
                for (Class cl : parameterTypes) {
                    System.out.println(cl.getName());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
