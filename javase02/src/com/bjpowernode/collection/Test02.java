package com.bjpowernode.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection中存储自定义类型的元素
 * 1.Collection中如果要存储自定义类型的元素，一定要重写equals方法
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.创建一个集合对象
        Collection c = new ArrayList();
        // 2.创建几个学生对象
        Student s1 = new Student("张三");
        Student s2 = new Student("李四");
        Student s3 = new Student("王五");
        Student s4 = new Student("赵柳");
        Student s5 = new Student("tom");
        // 3.将学生对象添加进集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);
        // 判断学生张三是否在集合中存在
        boolean b = c.contains(new Student("张三"));
        System.out.println(b);
        // 从集合中删除李四
        c.remove(new Student("李四"));
        System.out.println(c);
    }
}
class Student {
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
        }
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