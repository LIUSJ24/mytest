package com.bjpowernode.array;

/**
 * 数组的迭代/遍历/循环
 * 2种方式：for循环、增强for循环/foreach循环
 *
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {30,5,6,7,1,40};
        // 遍历数组
        // 1.for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /**
         * 2.增强for循环/foreach循环 新型for循环
         * 语法格式：for(数组中元素的类型 临时变量名 : 数组名){循环体}
         * 增强for循环没有下标
         */
        System.out.println("===============");
        for(int a : arr){
            System.out.println(a);
        }
    }
}
