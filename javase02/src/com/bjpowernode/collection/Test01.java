package com.bjpowernode.collection;

import java.util.*;

/**
 * Collection父接口中的常用方法
 * 1.集合是一个容器，但是它是动态的，长度不固定，所以创建集合对象的时候，不需要指定集合长度。
 * 2.集合中的元素类型可以不一致，在没有指定泛型的时候，可以存储任意的java对象。
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.获取/创建Collection集合的对象
        Collection c = new ArrayList();
        // 2.add(E e) 向集合中添加元素
        // 基本类型的10，在这里被自动装箱为Integer类型了。
        c.add(10);
        c.add(2.19);
        c.add(false);
        c.add("abc");
        c.add(new Object());
        // 3.addAll(Collection<? extends E> c)：将一组元素全部一次性添加到当前集合中
        Collection c1 = new ArrayList();
        c1.addAll(c);
        System.out.println(c1);
        // 4.clear():清空集合中的元素
        c1.clear();
        System.out.println(c1);
        // 5.contains(Object o)
        System.out.println(c.contains(11));
        // 6.containsAll(Collection<?> c):判断一组元素是否全部包含
        c1.add(10);
        c1.add(false);
        c1.add(4);
        System.out.println(c.containsAll(c1));
        // 7.isEmpty() :判断集合是否为null，判断集合中是否有元素
        System.out.println(c.isEmpty());
        // 8.remove(Object o):从集合中删除指定的元素
        c.remove(10);
        System.out.println(c);
        // 9.removeAll(Collection<?> c):删除一组元素
        // 10.size() :获取集合中元素的个数
        System.out.println(c.size());
        // 11.toArray():将集合转换为数组
        Object[] objects = c.toArray();
        // 12.数组转换为集合:asList(T... a)
        int[] arr = {10,20,30};
        List ints = Arrays.asList(arr);
    }
}
