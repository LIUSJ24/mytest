package com.bjpowernode.array;

/**
 * 三维数组的使用和遍历
 */
public class Test14 {
    public static void main(String[] args) {
        int[][][] arr = new int[5][6][8];
        // 修改三维数组中的元素
        arr[0] = new int[][]{{3,4},{6}};
        // 修改三维数组中二维数组的元素
        arr[1][0] = new int[]{4,7,9};
        // 修改三维数组中二维数组中一维数组的元素
        arr[2][1][0] = 40;
        System.out.println(arr[3][4][0]);

        // 三维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            int[][] a = arr[i];
            for (int j = 0; j < a.length; j++) {
                int[] b = a[j];
                for(int x : b){
                    System.out.println(x);
                }
            }
        }
    }
}
