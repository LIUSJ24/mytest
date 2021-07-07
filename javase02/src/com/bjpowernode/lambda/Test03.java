package com.bjpowernode.lambda;

/**
 * 使用lambda实现接口
 * 1.lambda实现接口有一个条件：这个接口只能有一个抽象方法,但是可以有静态方法和默认方法。
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.使用lambda实现MyInterface4
        MyInterface4 mi = ()->{
            return 10;
        };
        int i = mi.m1();
        System.out.println(i);
        // 省略规则4：大括号中只有一句代码，并且这句语句是return的话，大括号和return都可以进行省略。
        MyInterface4 mi2 = () -> 20;
        int i1 = mi2.m1();
        System.out.println(i1);

        // 2.使用lambda实现MyInterface5
        MyInterface5 mi3 = a -> "abc";
        String s = mi3.m1(30);
        System.out.println(s);

        // 3.使用lambda实现MyInterface6
        MyInterface6 mi4 = (a,b)-> false;
        boolean b = mi4.m1(10, "40");
        System.out.println(b);
    }
}
interface MyInterface4 {
    // 有返回值无参
    int m1();

    static void m2(){
        System.out.println("接口中的静态方法");
    }

    default void m3(){
        System.out.println("接口中的默认方法");
    }

    // void m2();
}
interface MyInterface5 {
    // 有返回值带1个参数
    String m1(int a);
}
interface MyInterface6 {
    // 有返回值带2个参数
    boolean m1(int a,String b);
}