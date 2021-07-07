package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Map集合中存储自定义类型的元素
 * Map集合中如果存储自定义类型的元素，为了保证所有的方法都能返回正确的结果，需要重写自定义类的equals方法和hashCode方法。
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.创建Map集合对象
        Map<Student, Integer> map = new HashMap<>();
        // 2.创建几个学生对象
        Student s1 = new Student("张三");
        Student s2 = new Student("李四");
        Student s3 = new Student("王五");
        // 3.将3个学生对象作为key值保存进map集合
        map.put(s1,22);
        map.put(s2,28);
        map.put(s3,20);
        System.out.println(map);
        // containsKey(Object key)：通过调用equals方法来判断是否包括
        System.out.println(map.containsKey(new Student("张三")));
    }
}
class Student{
    private String name;

    public Student(String name) {
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
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }else {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                if (s.name.equals(this.name)) {
                    return true;
                }
                return false;
            }else {
               return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}