package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 二维数组的遍历
 */
public class Test11 {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        for (int i = 0; i < arr.length; i++) {
            int[] a = arr[i];
            System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < arr.length; i++) {
            int[] a = arr[i];
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[j]);
            }
        }
        System.out.println("==========");
        for(int[] a : arr){
            for(int i : a){
                System.out.println(i);
            }
        }
    }
}
