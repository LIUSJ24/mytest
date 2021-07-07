package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 数组的初始化
 * -静态：在对数组初始化的时候，数组中的元素已经固定
 * 1.int[] arr = {};
 * 2.int[] arr = new int[]{};因为数组是引用类型，所以可以使用个new关键字创建对象
 * 3.动态初始化：
 * int[] arr = new int[10];这种写法在初始化的时候数组中的元素是未知的，但是数组在初始化的时候必须指定长度
 *
 */
public class Test02 {
    // 1.数组的第一种初始化方式
    int[] arr = {};
    int[] arr1 = {10,20,30,40,50,60};
    String[] strs = {"张三","李四","王五"};
    // 2.数组的第二种初始化方式
    int[] arr2 = new int[]{};   // 等价于12行
    double[] arr3 = new double[]{3.1,3.4,5.6,7.8,9.4};
    // 数组中元素的类型必须和声明的类型保持一致，否则代码编译报错
    // int[] arr4 = new int[]{100,3.14,"cnd"};
    int[] arr4 = new int[]{(int) 3.14};
    // 3.动态初始化
   // int[] arr5 = new int[];       如果没有大括号，那么中括号中一定要写上数组的长度
   // int[] arr6 = new int[10]{};   如果有大括号，那么中括号中就不能写长度
    int[] arr6 = new int[10];

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        System.out.println(Arrays.toString(arr1));
        char[] arr2 = new char[5];
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = new String[5];
        System.out.println(Arrays.toString(arr3));
    }
}
