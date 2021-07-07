package com.bjpowernode.array;

/**
 * 二分查找法
 */
public class Test17 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int index = findElement(66, arr);
        System.out.println(index);
    }
    public static int findElement(int ele,int[] arr){
        int begin = 0;
        int end = arr.length -1 ;
        while(begin <= end){
            int mid = (begin + end) / 2;
            if(arr[mid] == ele){
                return mid;
            }else if (arr[mid] < ele){
                // 目标元素在右边
                begin = mid + 1;
            }else {
                end = mid -1 ;
            }
        }
        return -1;
    }
}
