package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"张三1");
        map.put(20,"张三2");
        map.put(30,"张三3");
        map.put(40,"张三");
        map.put(50,"张三");
        map.put(60,"张三5");
        map.put(70,"张三");
        map.put(80,"张三7");
        map.put(90,"张三");
        map.put(100,"张三9");
        map.put(101,"张三");
        map.put(102,"张三");

        // 添加第13个元素，需要进行扩容
        map.put(103,"abc");


    }
}
