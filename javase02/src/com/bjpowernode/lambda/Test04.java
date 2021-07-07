package com.bjpowernode.lambda;

/**
 * 使用lambda抽取方法进行方法调用
 */
public class Test04 {
    public static void main(String[] args) {
        // 当很多人同时写了lambda实现接口，而且很多人写的代码都一样的话，就会操作代码的重复
        // 为了避免代码的重复，可以将大括号中的内容抽取成一个单独的方法，使用lambda调用方法
//        MyInterface7 m = () -> {};
//        MyInterface7 m = () -> {};
//        MyInterface7 m = () -> {};
        // 使用lambda调用方法
        MyInterface7 m = ()->doSome();
        m.m1();
        MyInterface7 m1 = Test04::doSome;
        m1.m1();
        Test04 test04 = new Test04();
        MyInterface7 m2 = test04::doSome1;
    }

    public static void doSome(){
        System.out.println("抽取方法的内容");
    }

    public void doSome1(){
        System.out.println("非静态方法");
    }

}

/**
 * 这个注解的作用：用来检查当前的接口有且仅有一个抽象方法
 */
@FunctionalInterface
interface MyInterface7 {
        void m1();
}