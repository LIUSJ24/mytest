package com.bjpowernode.array;

import java.util.Objects;

/**
 * 数组的声明
 *  数据类型[] 数组变量名; 数据类型可以是任意的类型。
 *  数组可以作为全局变量/成员变量/字段，局部变量
 */
public class Test01 {
    // 数组作为全局变量/成员变量
    byte[] arr1;
    // C++的语法，在java中不建议写
    byte arr2[];
    short[] arr3;
    int[] arr4;
    long[] arr5;
    float[] arr6;
    double[] arr7;
    char[] arr8;
    boolean[] arr9;

    String[] arr10;
    Object[] arr11;

    public static void main(String[] args) {
        // 数组作为局部变量
        byte[] arr1;
        byte arr2[];

        String[] arr3;
        Object arr4;

        // 可以声明一个自定义的类型的数组
        Student[] stus;
    }
}
class Student {

}