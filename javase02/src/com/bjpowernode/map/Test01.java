package com.bjpowernode.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的常用方法
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.创建Map集合对象
        Map<Integer, String> map = new HashMap<>();
        // 2.put(K key, V value)：向map集合中添加元素（键值对）
        map.put(20,"张三");
        // map.put(2.4,5478);
        map.put(30,"李四");
        System.out.println(map);
        // 3.putAll(Map<? extends K,? extends V> m):直接添加一个map集合
        Map<Integer,String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println(map1);
        // 4.clear():清空Map集合中的键值对
        map1.clear();
        System.out.println(map1);
        // 5.containsKey(Object key):判断当前集合的所有key值中是否包括指定的key
        System.out.println(map.containsKey(20));
        System.out.println(map.containsKey("张三"));
        // 6.containsValue(Object value):判断当前集合的所有value值中是否包含了指定的value
        System.out.println(map.containsValue("张三"));
        System.out.println(map.containsValue(20));
        // 7.get(Object key):通过key值去查询value
        String value = map.get(30);
        System.out.println(value);
        // 8.isEmpty():判断map集合中是否有键值对
        System.out.println(map.isEmpty());
        System.out.println(map1.isEmpty());
        map.put(30,"王五");
        System.out.println(map);
        // 9.remove(Object key):根据key去删除键值对
        map.remove(30);
        System.out.println(map);
        // 10.remove(Object key, Object value):根据key和value去删除键值对
        map.remove(20,"张三");
        System.out.println(map);
        // 11.replace(K key, V value)：根据key值去替换原来的value
        map.put(20,"张三");
        map.put(30,"李四");
        map.put(40,"小明");
        map.replace(30,"王五");
        System.out.println(map);
        // 12.replace(K key, V oldValue, V newValue):根据key和value去替换原来的value
        map.replace(20,"张三5","张三1");
        System.out.println(map);
        // 13.size():获取Map集合中键值对的数量
        System.out.println(map.size());
        // 14.keySet():将Map集合中的所有的key部分的元素全部放到一个Set集合中
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        // 15.values():将Map集合中的所有value部分的元素全部放到一个Collection集合中
        Collection<String> values = map.values();
        System.out.println(values);
        // 16.entrySet():将Map集合中key和value组合成key=value的形式，组成了一个新的元素，放到Set集合中
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

    }
}
