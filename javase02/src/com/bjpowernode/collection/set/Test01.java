package com.bjpowernode.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1、Set集合存储元素的特点：无序不可重复，因为元素无序，所以没有下标
 * 无序：元素添加的顺序和取出来的顺序不一致
 * 不可重复：set集合中的元素不能重复
 * 2、Set集合的遍历:2种遍历方式
 *  第一种：增强for
 *  第二种：迭代器
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.创建Set集合对象
        Set set = new HashSet();
        // 2.向集合中添加一些元素
        set.add(10);
        set.add(30);
        set.add(20);
        set.add("abc");
        set.add(false);
        set.add("zhangsan");
        // 添加已经存在的元素，代码不会报错，只是元素不会添加
        set.add(10);
        set.add(10);
        set.add(10);
        System.out.println(set);

        // 3.Set集合的遍历
        // 3.1 增强for
        for(Object obj : set){
            System.out.println(obj);
        }
        System.out.println("=============");
        // 3.2 迭代器
        // 第一步：获取迭代器对象
        Iterator it = set.iterator();
        // 第二步：通过hasNext()方法判断有没有下一个元素，有的话，使用next()方法获取下一个元素
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
