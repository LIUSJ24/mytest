package com.bjpowernode.map;

import java.util.Map;
import java.util.TreeMap;

public class Test17 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(10,"张三");
        map.put(2,"张三1");
        map.put(6,"张三4");
        map.put(8,"张三5");
        map.put(4,"张三7");
        // map.put(null,"fceubu");
        map.put(50,null);
    }
}
