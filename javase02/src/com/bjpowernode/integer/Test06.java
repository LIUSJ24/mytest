package com.bjpowernode.integer;

/**
 * 基本类型、包装类、String
 * 有以下3个变量int i1 = 10;Integer i2 = 20;String s = "30";
 */
public class Test06 {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = 20;
        String s = "30";
        // 1.int -- > Integer
        // 手动装箱
        Integer i3 = new Integer(i1);
        // 自动装箱
        Integer i4 = i1;
        Integer i5 = Integer.valueOf(i1);
        // 2.Integer --> int
        // 手动拆箱
        int intValue = i2.intValue();
        // 自动拆箱
        int intValue1 = i2;
        // 3.int --> String
        String s1 = i1 + "";
        String s2 = String.valueOf(i1);
        String s3 = Integer.toString(i1);
        // 4.String --> int
        int i = Integer.parseInt(s);
        // 5.Integer --> String
        String s4 = String.valueOf(i2);
        // 6.String --> Integer
        Integer integer = Integer.valueOf(s);
    }
}
