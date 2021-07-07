package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HashMap散列分布均匀
 * HashMap集合中如果存储自定义类型的元素，该自定义类型必须重写equals和hashCode方法，
 * 重写equals方法的目的，是为了判断key是不是存在。重写hashCode方法的目的，是为了散列分布均匀。
 */
public class Test08 {
    public static void main(String[] args) {
        Map<Student1, Integer> map = new HashMap<>();
        Student1 s1 = new Student1("张三");
        Student1 s2 = new Student1("李四");
        Student1 s3 = new Student1("王五");
        Student1 s4 = new Student1("小明");
        Student1 s5 = new Student1("小花");
        map.put(s1,20);
        map.put(s2,20);
        map.put(s3,20);
        map.put(s4,20);
        map.put(s5,20);
        Student1 s6 = new Student1("张三");
        System.out.println(s1.hashCode());
        System.out.println(s6.hashCode());
    }
}
class Student1 {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return Objects.equals(getName(), student1.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}