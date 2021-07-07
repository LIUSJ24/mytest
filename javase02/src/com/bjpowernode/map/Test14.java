package com.bjpowernode.map;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

/**
 * TreeMap集合key部分存储自定义类型的元素，实现排序的第二种方式。
 * 定义一个比较器Comparator，作为参数传入TreeMap的构造方法
 */
public class Test14 {
    public static void main(String[] args) {
        Student3 s1 = new Student3(45);
        Student3 s2 = new Student3(24);
        Student3 s3 = new Student3(28);
        Student3 s4 = new Student3(32);
        Student3 s5 = new Student3(19);
        // 创建一个Comparator接口对象。
        Comparator<Student3> com = new AgeComparator();
        TreeMap<Student3, String> map = new TreeMap<>(com);
        map.put(s1,"张三");
        map.put(s2,"李四");
        map.put(s3,"王五");
        map.put(s4,"小明");
        map.put(s5,"小红");
        System.out.println(map);
    }
}
class Student3 {
    private int age;

    public Student3(int age) {
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
        return "Student3{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return getAge() == student3.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
class AgeComparator implements Comparator<Student3> {

    /**
     * 这个方法里就需要写比较规则
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.getAge() - o2.getAge();
    }
}