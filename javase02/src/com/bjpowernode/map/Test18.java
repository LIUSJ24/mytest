package com.bjpowernode.map;

import java.util.HashSet;

/**
 * HashSet集合
 * 1.向HashSet集合中存储元素的时候，其实这个元素是被放到了HashMap集合的key部分，在HashMap的value部分
 * 放了一个new Object();
 */
public class Test18 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(1);
        set.add(67);
        set.add(34);
    }
}
