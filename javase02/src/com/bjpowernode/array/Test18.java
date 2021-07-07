package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 数组工具类Arrays
 */
public class Test18 {
    public static void main(String[] args) {
        // 1.binarySearch(int[] a, int key)
        int[] arr = {10,20,30,40,50,60};
        int index = Arrays.binarySearch(arr, 20);
        System.out.println(index);
        // 2.sort(byte[] a)
        double[] arr1 = {32.4,6.7,88,9,1.09};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
