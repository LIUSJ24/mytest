package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 数组的冒泡排序
 */
public class Test15 {
    public static void main(String[] args) {
        int[] arr = {4,1,3,6,2,9};
        // 外层for循环模拟比较的次数
        for(int i = 0; i < arr.length - 1;i++){
            // 内存for循环模拟每次比较的趟数
            for(int j = 0; j < arr.length - 1 - i;j++){
                // 比较相邻的两个元素，如果前面的比后面的小，则交换位置
                if(arr[j] < arr[j + 1]){
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

       int[] arr1 = {5,6,9,1,3,10};
        // 冒泡排序的第二种写法
        for (int i = arr1.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
            // 比较相邻的两个元素，如果前面的比后面的小，则交换位置
                if(arr1[j] < arr1[j + 1]){
                    int tem = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
