package com.bjpowernode.lambda;

/**
 * 如果大括号中的代码只有一句，并且这句是返回一个新创建的对象，代码可以简化成：对象类型::new;
 */
public class Test07 {
    public static void main(String[] args) {
        // 使用lambda实现StudentInterface接口
        StudentInterface si = ()->{
            return new Student();
        };

        StudentInterface si1 = () -> new Student();
        // 以上的代码还有另一种写法
        StudentInterface si2 = Student::new;

    }
}
@FunctionalInterface
interface StudentInterface {
    Student getStudent();
}

class Student {
    private int age;
    private String name;

    public Student(){}

    public Student(int age, String name) {
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
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}