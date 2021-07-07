package com.bjpowernode.map;

import java.util.*;

/**
 * Collections工具类
 * 1.属性
 * 2.方法
 */
public class Test22 {
    public static void main(String[] args) {
        List emptyList = Collections.EMPTY_LIST;
        Map emptyMap = Collections.EMPTY_MAP;
        Set emptySet = Collections.EMPTY_SET;

        // 1.binarySearch(List<? extends Comparable<? super T>> list, T key)：
        // 返回一个元素在List集合中的下标，如果不存在，返回负数,前提是数组中的元素需要排序
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(170);
        int index = Collections.binarySearch(list, 30);
        System.out.println(index);
        // 2.reverse(List<?> list):反转list集合中的元素
        Collections.reverse(list);
        System.out.println(list);
        // 3.sort(List<T> list)
        List<Integer> list1 = new ArrayList<>();
        list1.add(30);
        list1.add(10);
        list1.add(60);
        list1.add(4);
        list1.add(26);
        Collections.sort(list1);
        System.out.println(list1);

        Student7 s1 = new Student7(40);
        Student7 s2 = new Student7(34);
        Student7 s3 = new Student7(26);
        List<Student7> list2 = new ArrayList<>();
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        Comparator comparator = new Comparator<Student7>() {
            @Override
            public int compare(Student7 o1, Student7 o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(list2,comparator);
        System.out.println(list2);

        // 4.synchronizedList(List<T> list):将非线程安全的List集合转换为线程安全的集合
        List<Integer> list3 = new ArrayList<>();
        // list4是线程安全的，在多线程的环境下，如果要使用ArrayList集合，为了保证数据安全，可以执行此方法
        List<Integer> list4 = Collections.synchronizedList(list3);
        // 5.synchronizedMap(Map<K,V> m)
        Map<Integer, String> map = new HashMap<>();
        // map1就是线程安全的
        Map<Integer, String> map1 = Collections.synchronizedMap(map);

    }
}
class Student7 {
    private int age;

    public Student7(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student7{" +
                "age=" + age +
                '}';
    }
}
