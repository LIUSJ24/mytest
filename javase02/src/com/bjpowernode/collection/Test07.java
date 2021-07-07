package com.bjpowernode.collection;

import java.util.*;

/**
 * JDK1.5之后，泛型支持类型自动推断，又称作是“钻石表达式”。
 * 等号右边的尖括号中的类型名称可以不写，会根据左边的泛型名称进行自动推断。
 */
public class Test07 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<Double> set = new HashSet<>();
    }
}
