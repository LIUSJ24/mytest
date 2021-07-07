package com.bjpowernode.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        // 这个方法的下标不能大于当前集合的长度
        list.add(1,33);
        System.out.println(list);
    }
}
