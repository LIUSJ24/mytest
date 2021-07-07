package com.bjpowernode.collection.list;

import java.util.LinkedList;

/**
 * LinkedList集合
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.addFirst(11);
        linkedList.addLast(22);
    }
}
