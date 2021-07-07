package com.bjpowernode.array;

/**
 * 三维数组的创建
 */
public class Test13 {
    public static void main(String[] args) {
        // 1.静态方式
        int[][][] arr = {};
        int[][][] arr1 = {{}};
        int[][][] arr2 = {{{}}};
        int[][][] arr3 = {{{32},{3,5}}};
        // 2.静态方式
        int[][][] arr4 = new int[][][]{
                {{5},{6,7}},
                {{3,6,7}}
        };
        // 3.动态方式
        int[][][] arr5 = new int[3][4][5];
        int[][][] arr6 = new int[5][][];
        int[][][] arr7 = new int[5][6][];
        // int[][][] arr8 = new int[][4][2];
    }
}
