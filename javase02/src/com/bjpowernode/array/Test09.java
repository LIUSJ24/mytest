package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 数组的扩容：
 *  数组的拷贝实现
 */
public class Test09 {
    public static void main(String[] args) {
        int[] oldArr = {6,7,1,3,2};
        // 1.创建一个更大容量的新数组
        int[] newArr = new int[oldArr.length + 5];
        // 2.将旧数组中的元素一个一个的拷贝到新数组
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        System.out.println(Arrays.toString(newArr));
        // 3.System.arraycopy()
        int[] newArr1 = new int[oldArr.length + 5];
        // 第一个参数：拷贝的源数组，旧数组
        // 第二个参数：旧数组中，从那一个位置开始拷贝
        // 第三个参数：拷贝之后的新数组
        // 第四个参数：新数组中元素从那个位置开始存储
        // 第五个参数：旧数组中，拷贝的元素长度
        System.arraycopy(oldArr,2,newArr1,2,3);
        System.out.println(Arrays.toString(newArr1));
        // 4.Arrays.copyof():等价于System.arraycopy(oldArr,0,destArr,0,oldArr.length)
        int[] destArr = Arrays.copyOf(oldArr, oldArr.length + 5);
        System.out.println(Arrays.toString(destArr));
    }
}

