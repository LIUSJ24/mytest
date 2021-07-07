package com.bjpowernode.array;

/**
 * 当一个方法的参数是一个数组的时候
 */
public class Test06 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        f1(arr);
        // 合并代码
        f1(new int[10]);
        // f1({10,3,4}); 这种是写法是不允许的
        int[] arr1 = {10,3,4};
        f1(arr1);
        f1(new int[]{10,4,56,8});
    }

    public static void f1(int[] arr){

    }
}
