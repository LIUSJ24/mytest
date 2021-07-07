package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 选择排序法
 */
public class Test16 {
    public static void main(String[] args) {
        int[] arr = {4,1,3,6,2,9};
        for(int i = 0 ;i < arr.length - 1;i++){
            // 最左边的元素下标 i
            // 最小的元素的下标
            int min = i;
            for(int j = i + 1; j < arr.length - 1;j ++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // 最小的下标和最左边的进行交换
            if(min != i){
                int tem = arr[min];
                arr[min] = arr[i];
                arr[i] = tem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
