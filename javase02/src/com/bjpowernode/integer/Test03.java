package com.bjpowernode.integer;

/**
 * 包装类Integer中的方法
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.创建包装类的对象
        Integer i1 = new Integer(10);
        // 2.compare(int x, int y):如果前面的数比后面的大，返回正数，如果前面的比后面的小，返回负数，如果两个相等返回0
        int compare = Integer.compare(10, 11);
        System.out.println(compare);
        System.out.println(Integer.compare(10,10));
        System.out.println(Integer.compare(10,9));
        // 3.compareTo(Integer anotherInteger)
        Integer i2 = new Integer(9);
        System.out.println(i1.compareTo(i2));
        // 4.max(int a, int b):求两个数之间的最大值
        System.out.println(Integer.max(10,20));
        // 5.min(int a, int b):求两个之间的最小值
        System.out.println(Integer.min(10,20));
        // 6.parseInt(String s):将一个字符串转换为基本类型******
        String s = "10";
        int i = Integer.parseInt(s);
        System.out.println(i);
        // 7.toBinaryString(int i) :将一个十进制的数字转换为2进制
        System.out.println(Integer.toBinaryString(322222));
        // 8.toHexString(int i):将一个十进制转换为16进制
        System.out.println(Integer.toHexString(89888));
        // 9.toOctalString(int i):将一个十进制转换为8进制
        System.out.println(Integer.toOctalString(890898));
        // 10.toString():将包装类转换为String
        String s1 = i1.toString();
        // 11.toString(int i):将一个基本类型转换为String
        String s2 = Integer.toString(10);
        // 12.valueOf(int i):将基本类型转换为包装类（装箱）
        Integer integer = Integer.valueOf(10);
        // 13.valueOf(String s):将字符串转换为包装类
        Integer integer1 = Integer.valueOf("30");
    }
}
