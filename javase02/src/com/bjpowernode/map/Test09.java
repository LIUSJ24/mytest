package com.bjpowernode.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable
 */
public class Test09 {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();
        map.put(10,"张三1");
        map.put(20,"张三2");
        map.put(30,"张三3");
        map.put(40,"张三4");
        map.put(60,"张三5");
        map.put(70,"张三5");
        map.put(80,"张三5");
        map.put(90,"张三5");

        // 添加第9个元素，底层数组需要扩容
        map.put(100,"abc");
    }
}
