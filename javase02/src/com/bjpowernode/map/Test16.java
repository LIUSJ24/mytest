package com.bjpowernode.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 匿名内部类实现比较器接口
 */
public class Test16 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(20);
        Student4 s2 = new Student4(55);
        Student4 s3 = new Student4(32);
        Student4 s4 = new Student4(16);
        Student4 s5 = new Student4(36);
        // 使用匿名内部类写一个Comparator对象
        Comparator com = new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Map<Student4,String> map = new TreeMap<>(com);
        map.put(s1,"张三");
        map.put(s2,"李四");
        map.put(s3,"王五");
        map.put(s4,"小明");
        map.put(s5,"小i红");
        System.out.println(map);
    }
}
class Student4 {
    private int age;

    public Student4(int age) {
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
        return "Student4{" +
                "age=" + age +
                '}';
    }
}