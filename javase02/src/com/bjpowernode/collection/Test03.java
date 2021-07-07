package com.bjpowernode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历
 * 1.增强for循环/foreach循环/新型循环
 * 2.迭代器
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.创建一个Collection集合
        Collection c = new ArrayList();
        // 2.向集合中添加元素
        c.add(10);
        c.add(30);
        c.add(4.5);
        c.add(false);
        c.add("abc");
        // 3.遍历集合
        // 3.1 增强for
        for(Object obj : c){
            System.out.println(obj);
        }
        System.out.println("=============");
        // 3.2 迭代器遍历
        // 第一步：获取当前集合对应的迭代器对象
        Iterator it = c.iterator();
        // 第二步：调用next()方法
//        Object next = it.next();
//        System.out.println(next);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
