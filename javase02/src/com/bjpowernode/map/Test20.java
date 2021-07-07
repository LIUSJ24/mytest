package com.bjpowernode.map;

import java.util.TreeSet;

public class Test20 {
    public static void main(String[] args) {
        Student5 s1 = new Student5(30);
        Student5 s2 = new Student5(18);
        Student5 s3 = new Student5(23);
        Student5 s4 = new Student5(56);
        Student5 s5 = new Student5(17);
        TreeSet<Student5> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
    }
}
class Student5 implements Comparable<Student5>{
    private int age;

    public Student5(int age) {
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
        return "Student5{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student5 o) {
        return o.age - this.age;
    }
}