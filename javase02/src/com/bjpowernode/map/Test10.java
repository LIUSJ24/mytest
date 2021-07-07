package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * HashMap和Hashtable对null值的处理
 * 1、HashMap的key和value都可以为null
 * 2、Hashtable的key和value都不可以为null
 */
public class Test10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(null,"abc");
        System.out.println(map);
        System.out.println(map.get(null));
        map.put(null,null);
        System.out.println(map);

        Map<Integer, String> map1 = new Hashtable<>();
        // Hashtable集合的key不能为null
        // map1.put(null,"abc");
        map1.put(10,null);
        System.out.println(map1);
    }
}
