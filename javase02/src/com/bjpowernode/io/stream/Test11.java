package com.bjpowernode.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ObjectOutputStream：OOS对象
 * 将java对象保存进文件，对象的序列化
 * 1.如果一个自定义的对象直接序列化，会抛出异常java.io.NotSerializableException: com.bjpowernode.io.stream.Student
 * 2.解决方案：自定义的类去实现一个序列化接口Serializable
 * 3.Serializable：这是一个标志接口，它里面没有抽象方法，它的作用只是给当前的类打个标记，有了这个标记后，
 * 虚拟机会对这个类进行特殊处理
 * 4.一个类实现了Serializable接口后，在编译的时候，虚拟机会自动生成一个默认的序列化版本号,每次类里的代码发生了改变，
 * 虚拟机生成的版本号也会发生改变，所以为了保证版本号前后一致，应该显式的定义出来。
 * 5.IDEA工具中自动生成序列化版本号：File-->Settings-->Editor-->Inspections-->Serializable without .....后面的方框选择上
 * 然后，鼠标定位在列名上，按alt+enter(回车键)
 */
public class Test11 {
    public static void main(String[] args) {
        Student s = new Student("sz2010001","张三",20);
        // 1.创建OOS对象
        try(FileOutputStream fos = new FileOutputStream("src\\com\\bjpowernode\\io\\stream\\object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // 2.调用oos中的写对象的方法
            oos.writeObject(s);
            // 3.刷新
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * transient：游离的，用来修改java中属性，表示该属性不参与序列化
 */
class Student implements Serializable {

    private static final long serialVersionUID = -6968893415279556252L;
    private String no;
    private String name;
    private transient int age;

    // 后期代码发生了改变
    private char gender;

    private String phone;

    public Student(String no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}