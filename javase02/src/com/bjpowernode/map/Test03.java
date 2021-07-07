package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class Test03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10,"张三");
        map.put(20,"李四");
        map.put(30,"王五");
        map.put(40,"赵六");
        map.put(50,"小明");
        // Map集合的遍历
        // 1.通过keySet方法将所有的key值放到Set集合中，通过遍历Set集合，来遍历Map
        Set<Integer> keySet = map.keySet();
        for(Integer in : keySet){
            String value = map.get(in);
            System.out.println(in + "=" + value);
        }
        System.out.println("========迭代器遍历Set集合=========");
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=======entrySet方法遍历=========");
        // 2.通过entrySet方法将所有的key和value拼接，然后返回一个Set集合
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("=========第二种方式的迭代器==========");
        Iterator<Map.Entry<Integer, String>> it2 = entries.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }
}
