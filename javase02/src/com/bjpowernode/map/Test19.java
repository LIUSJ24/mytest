package com.bjpowernode.map;

import java.util.TreeSet;

/**
 * TreeSet集合
 * 1.放到TreeSet集合中的元素可以自动排序
 * 2.放到TreeSet集合中的元素其实是放在了TreeMap集合的key部分，在TreeMap的value部分放了一个new Object();
 */
public class Test19 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(34);
        set.add(1);
        set.add(3);
        set.add(78);
        System.out.println(set);
    }
}
