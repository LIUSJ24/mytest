package com.bjpowernode.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap集合
 */
public class Test12 {
    public static void main(String[] args) {
        // 1.创建TreeMap集合对象
        Map<Integer, String> map = new TreeMap<>();
        // 2.添加元素
        map.put(3,"张三");
        map.put(7,"李四");
        map.put(2,"王五");
        map.put(1,"小明");
        map.put(9,"小红");
        map.put(8,"小黑");
        System.out.println(map);

        Map<String, Double> map1 = new TreeMap<>();
        map1.put("abc",3.14);
        map1.put("ujymy",34.14);
        map1.put("thtut",7.14);
        map1.put("vhr",9.14);
        System.out.println(map1);
    }
}
