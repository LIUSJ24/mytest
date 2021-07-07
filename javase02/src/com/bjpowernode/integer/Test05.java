package com.bjpowernode.integer;

/**
 * 自动装箱和自动拆箱
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.自动装箱（将一个基本类型自动转换为包装类）,将一个基本类型的值直接赋给一个引用类型的对象
        Integer i1 = 10;
        // 2.自动拆箱（将一个包装类自动转换为基本类型）
        Integer i2 = new Integer(30);
        int i3 = i2;
    }
}
