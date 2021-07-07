package com.bjpowernode.lambda;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(20);
        list.add(80);
        // 遍历集合
       // list.forEach(a->System.out.println(a));
        list.forEach(System.out::println);
    }
}
