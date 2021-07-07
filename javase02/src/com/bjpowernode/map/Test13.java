package com.bjpowernode.map;

import java.util.Objects;
import java.util.TreeMap;

/**
 * TreeMap集合中存储自定义类型的元素，如何自动排序
 * 1.如果TreeMap集合中key部分的元素直接放自定义类型的元素，会抛出一个异常：
 * java.lang.ClassCastException: com.bjpowernode.map.Student2 cannot be cast to java.lang.Comparable
 * 2.原因：因为TreeMap集合key需要排序，所以每次添加元素的时候，都会拿着这个元素的key和之前的所有元素的key比较大小，
 * 小的放前面，大的放后面，因为自定义的类型没有指定比较规则，所以在向集合中添加的时候，不知道该怎么比较大小。
 * 3.解决办法：能够让Student2在强制转换为Comparable这个类的时候，不报错，可以进行正常转换，所以需要Student2这个类
 * 实现Comparable的接口
 */
public class Test13 {
    public static void main(String[] args) {
        TreeMap<Student2, String> map = new TreeMap<>();
        Student2 s1 = new Student2(20);
        Student2 s2 = new Student2(56);
        Student2 s3 = new Student2(34);
        Student2 s4 = new Student2(16);
        Student2 s5 = new Student2(32);
        // 将5个学生对象放入TreeMap集合的key部分，希望实现安装学生年龄进行排序
        map.put(s1,"张三");
        map.put(s2,"李四");
        map.put(s3,"王五");
        map.put(s4,"小红");
        map.put(s5,"小明");
        System.out.println(map);

    }
}
class Student2 implements Comparable<Student2>{
    private int age;

    public Student2(int age) {
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
        return "Student2{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return getAge() == student2.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }

    /**
     * 这个compareTo方法，就是用来定义比较规则的,这个compareTo方法有一个返回值，只要返回整数，就证明前面的数比后面的大
     * 如果返回负数，证明前面的数比后面的数小，如果返回0，证明两个数相等
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student2 o) {
////        if (this.age > o.age) {
////            return 1;
////        }else if (this.age < o.age){
//////            return -1;
//////        }
////        return 0;
        // 以上代码可以简化为下面的
        return this.age - o.age;
    }
}