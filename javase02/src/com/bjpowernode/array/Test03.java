package com.bjpowernode.array;

import java.util.Arrays;

/**
 * 数组的使用
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {10,4,6,19,30,5};
        // 1.获取数组中的元素：语法 数组名称[元素的下标]
        int a = arr[3];
        System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[5]);
        // 通过下标来获取元素的时候，下标不能超过数组的长度-1,否则会抛出数组下标越界的异常java.lang.ArrayIndexOutOfBoundsException: 6
        //System.out.println(arr[6]);
        // 2.修改数组中元素的值，19--->29
        arr[3] = 29;
        System.out.println(Arrays.toString(arr));
        // 3.获取数组的长度，通过数组的length属性
        System.out.println(arr.length);

        // 数组的元素是引用类型
        Object[] obj = {new Object(),new Object(),new Object()};
        Student1[] stus = new Student1[5];
        stus[0] = new Student1(20,"张三");
        System.out.println(Arrays.toString(stus));
        // 1.数组中的学生对象不变，修改对象的属性值 20--》30
//        Student1 stus1 = stus[0];
//        stus1.setAge(30);
        // 合并代码
        stus[0].setAge(30);
        System.out.println(Arrays.toString(stus));
        // 2.数组中的对象进行修改
        stus[0] = new Student1(40,"里斯");
        System.out.println(Arrays.toString(stus));
    }
}
class Student1{
    private int age;
    private String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
