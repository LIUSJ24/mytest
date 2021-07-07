package com.bjpowernode.lambda;

/**
 * lambda实现接口
 * 接口类型 变量名 = ()->{};
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.使用lambda实现MyInterface1
        MyInterface1 mi = ()->{
            System.out.println("接口1");
        };
        // 2.调用接口中的方法
        mi.m1();
        // 省略规则1：如果大括号中的代码只有一句，大括号可以省略
        MyInterface1 mi1 = () -> System.out.println("接口1的第二种方式");
        mi1.m1();

        // 如果没有参数，小括号不能省略
        // MyInterface1 mi11 = -> {};

        // 3.使用lambda实现MyInterface2
        MyInterface2 mi2 = (int a)->{
            System.out.println(a);
        };
        mi2.m1(10);
        // 省略规则2：小括号中的参数类型可以省略，它会根据传入的实参自动推动形参的类型
        MyInterface2 mi3 = (a)->{
            System.out.println(a + 10);
        };
        mi3.m1(30);
        // 省略规则3：当小括号中的参数个数只有一个的时候，小括号可以省略
        MyInterface2 mi4 = a -> System.out.println(a + "....");
        mi4.m1(50);

        // 4.实现MyInterface3接口
        MyInterface3 mi5 = (int a,String b)->{
            System.out.println(a);
            System.out.println(b);
        };
        mi5.m1(11,"张三");

        // 将形参的类型省略
        MyInterface3 mi6 = (a,b)->{
            System.out.println(a + 10);
            System.out.println(b + 10);
        };
        mi6.m1(33,"abc");

    }
}
interface MyInterface1 {
    // 无参无返回值
    void m1();
}
interface MyInterface2{
    // 无返回值带一个参数
    void m1(int a);
}
interface MyInterface3{
    // 无返回值带2个参数
    void m1(int a, String b);
}