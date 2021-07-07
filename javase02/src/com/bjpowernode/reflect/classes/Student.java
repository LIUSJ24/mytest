package com.bjpowernode.reflect.classes;

public class Student {

    static {
        System.out.println("静态代码块");
    }

    private String name = "张三";
    protected char gender;
    int age;
    public String phone;

    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name, char gender, int age, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
    }

    private void m1(int a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    protected void m2(){

    }
    void m3(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
