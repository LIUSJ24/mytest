package com.bjpowernode.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合的常用方法
 * 1.List集合有下标，所以可以通过下标对元素进行相应的操作
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.创建List集合对象
        List list = new ArrayList();
        // 2.add(E e):向list集合中添加元素
        list.add(10);
        list.add(3.14);
        list.add("abc");
        // 3.add(int index, E element):list集合独有的，在指定的位置上插入元素
        list.add(1,"小明");
        System.out.println(list);
        // 4.addAll(int index, Collection<? extends E> c):在指定的位置上插入一组元素
        List list1 =  new ArrayList();
        list1.add("abc");
        list1.add("def");
        list1.add(1,list);
        System.out.println(list1);
        // 5.get(int index)：通过下标获取对应的元素
        Object o = list.get(1);
        System.out.println(o);
        // 6.indexOf(Object o):返回某个元素在集合中第一次出现的位置，如果元素不存在，返回-1
        int index = list.indexOf("abc");
        System.out.println(index);
        // 7.lastIndexOf(Object o):返回某个元素在集合中最后一次出现的位置，如果元素不存在，返回-1
        list.add(10);
        System.out.println(list.lastIndexOf(10));
        // 8.remove(int index):删除指定位置上的元素
        Object o1 = list.remove(0);
        System.out.println(list);
        // 9.set(int index, E element):修改某个位置上的元素
        list.set(1,11);
        System.out.println(list);
        // 10.subList(int fromIndex, int toIndex):从原来的集合中截取一部分,含头不含尾
        List list2 = list.subList(1, 3);
        System.out.println(list2);

    }
}
