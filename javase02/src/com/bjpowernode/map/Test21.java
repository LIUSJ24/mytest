package com.bjpowernode.map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合中的元素进行排序的第二种方式
 */
public class Test21 {
    public static void main(String[] args) {
        Student6 s1 = new Student6(40);
        Student6 s2 = new Student6(23);
        Student6 s3 = new Student6(34);
        Student6 s4 = new Student6(19);
        Student6 s5 = new Student6(34);
        Comparator comparator = new Comparator<Student6>() {
            @Override
            public int compare(Student6 o1, Student6 o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        TreeSet<Student6> set = new TreeSet<>(comparator);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
    }
}
class Student6 {
    private int age;

    public Student6(int age) {
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
        return "Student6{" +
                "age=" + age +
                '}';
    }
}