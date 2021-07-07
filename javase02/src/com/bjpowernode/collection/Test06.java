package com.bjpowernode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 当一个集合指定了泛型后，对集合进行遍历
 *
 * 1.迭代器对象一旦获取之后，如果集合的机构发生了变化，迭代器对象还之前之前的集合，这样就会导致
 * 迭代器对象和集合对应不上，程序会报错
 * 2.迭代器遍历元素的时候，不能调用集合的删除方法来删除元素，否则代码会抛异常。
 * 3.在迭代器遍历元素的时候，可以调用迭代器的删除方法，因为迭代器的删除方法，在删除元素的同时，会去
 * 更新迭代器对象。
 */
public class Test06 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(10);
        c.add(20);
        c.add(30);
        // 迭代器对象的获取一定要放到所有的add方法之后，迭代器对象一旦获取，其后就不能再添加元素，否则代码会抛出异常
        // Iterator<Integer> it = c.iterator();
        c.add(40);
        c.add(50);
        // 集合的遍历
        for(Integer in : c){
            System.out.println(in + 10);
        }
        // 迭代器遍历
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            // c.remove(next);
            it.remove();
            System.out.println("---->" + next);
        }
        System.out.println(c);
    }
}
