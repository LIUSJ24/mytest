package com.bjpowernode.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * list集合的遍历:4种
 * 1.for循环
 * 2.增强for
 * 3.迭代器
 * 4.ListIterator
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.创建一个List集合
        List list = new ArrayList();
        list.add(10);
        list.add(3.14);
        list.add("abcd");
        list.add("张三");
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
        // 2.list集合的遍历
        // 2.1 for循环
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
        System.out.println("=============");
        // 2.2 增强for
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println("============");
        // 2.3 迭代器
        // 第一步：获取迭代器对象
        Iterator it = list.iterator();
        // 第二步：循环判断迭代器有没有下一个元素，如果有，就去迭代
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=============");
        // 3.ListIterator<E>:List集合独有的一个迭代器，是Iterator的一个子接口，有2个遍历方向，可以向前遍历，也可以向后遍历
        ListIterator listIt = list.listIterator();
        // 遍历
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }
        System.out.println("================");
        ListIterator listIterator = list.listIterator(3);
        // 向前遍历
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        // 向后遍历
        System.out.println("张三后边的元素：");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
