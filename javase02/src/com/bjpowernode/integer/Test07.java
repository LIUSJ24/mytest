package com.bjpowernode.integer;

/**
 * 为了提高开发效率，jdk在Integer加载的时候，就把-128-127范围之内的整数提前保存在整数型常量池中
 */
public class Test07 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);       // true

        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);       // false

        Integer i5 = new Integer(100);
        System.out.println(i1 == i5);       // false
    }
}
