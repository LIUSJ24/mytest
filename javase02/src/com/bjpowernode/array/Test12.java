package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 二维数组的使用
 */
public class Test12 {
    public static void main(String[] args) {
        int[][] arr = {{12,6,2},{4,2,1},{7},{8,1}};
        // 获取二维数组中某一个位置的一维数组
        int[] arr1 = arr[0];
        System.out.println(Arrays.toString(arr1));
        // 获取二维数组中一维数组的某个元素
        int a = arr[1][0];
        System.out.println(a);
        // 修改二维数组的元素
        arr[3] = new int[]{5,6,8};
        // 修改二维数组中一维数组的具体元素
        arr[3][0] = 80;
        // 获取二维数组的长度
        System.out.println(arr.length);
        System.out.println(arr[2].length);
    }
}
