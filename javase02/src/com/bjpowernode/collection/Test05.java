package com.bjpowernode.collection;

import java.util.*;

/**
 * 集合的泛型
 * 1.为集合的元素指定类型
 * 2.语法：集合类型<泛型的类型>
 * 3.当一个集合指定了泛型后，集合中的元素就只能添加泛型这种类型的元素
 * 4.集合的泛型不能是8种基本数据类型，必须是引用类型，因为集合中只能存引用类型数据
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.创建一个Collection集合对象，想要指定集合中只能存储整型类型
        // Collection<int> c = new ArrayList();
        Collection<Integer> c = new ArrayList<Integer>();
        // 2.此时，集合c中只能存储Integer类型的数据
        c.add(10);
        c.add(44);
        c.add(3);
//        c.add(3.14);
//        c.add(false);

        Collection<String> c1 = new ArrayList<String>();
        c1.add("abc");

        List<Double> list = new ArrayList<Double>();

       // Set<Integer> set = new HashSet<Double>();

    }
}
