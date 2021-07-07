package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 二维数组的创建
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr;  // 一维数组
        int[][] arr1;   // 二维数组
        // 二维数组的初始化
        // 1.静态方式
        int[][] arr2 = {};
        int[][] arr3 = {{}};
        // int[][] arr4 = {10,7};
        int[][] arr4 = {{10,4},{2},{3,4,6}};
        // 2.静态方式
        int[][] arr5 = new int[][]{};
        int[][] arr6 = new int[][]{{}};
        int[][] arr7 = new int[][]{{4},{6,7}};
        // 3.动态方式
        int[][] arr8 = new int[5][6];
        int[][] arr9 = new int[5][];
        // int[][] arr10 = new int[][10]; 这种语法是错误的
    }
}
