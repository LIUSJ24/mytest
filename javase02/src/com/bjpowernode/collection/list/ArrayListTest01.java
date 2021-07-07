package com.bjpowernode.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList集合：
 * 底层数组的扩容：扩容之后的新容量=旧容量*1.5
 * newCapacity = oldCapacity + (oldCapacity >> 1);
 *
 * ArrayList的构造方法：
 * 无参的构造方法，默认底层数组是10。
 * 为了减少底层数组的扩容次数，在创建ArrayList集合的时候尽量指定一个稍微大一点的初始化容量，
 * 这样可以避免底层数组频繁多次的扩容，从而提高代码的执行效率。
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        // 建议使用多态接收集合对象
        // 14行代码执行完了后，Object[] elementData = {};
        List<Integer> list1 = new ArrayList<>();
        // 向List集合中添加第一个元素的时候，将底层的数组进行扩容，扩容为了长度是10的数组
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(50);
        list1.add(50);
        list1.add(50);
        list1.add(50);
        list1.add(50);

        // 添加第11个元素，因为底层的数组满了，数组需要扩容
        list1.add(60);

        // ArrayList(int initialCapacity):创建ArrayList集合对象的时候，指定一个初始化容量
        List<Integer> list2 = new ArrayList<>(1024);
        list2.add(10);

    }
}
