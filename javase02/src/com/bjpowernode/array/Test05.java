package com.bjpowernode.array;

/**
 * 数组的内存分析
 * 1.数组整体是保存在堆中
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {10,4,5,7,1,90};
        int[] arr1 = new int[1024 * 1024 * 1024 * 10];

        Student[] stus = new Student[5];
        // stus中如果元素都进行了实例化后，其实数据中保存的5个内存地址
    }
}
