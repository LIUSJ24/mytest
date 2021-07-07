package com.bjpowernode.array;

/**
 * 方法的参数长度可变---可变长参数
 * 1.语法格式：数据类型... 参数名，这个点只能是3个
 * 2.如果一个方法中如果定义了可变长度参数，这个可变长参数只能放到参数列表的最后一位
 * 3.一个方法中的可变长度参数只能有一个
 * 4.可变长度参数其实就是一个数组
 */
public class Test08 {

    public static void main(String[] args) {
        // 调用f1,因为f1这个方法的参数长度不固定，所以调用的时候，参数可以传任意多个0-n
        f1();
        f1(10);
        f1(20,30);
        // 长度可变，但是类型是固定的
       // f1(39,"cbd");
        f1(new int[5]);
        f1(1,3,4,5,7);
        f1(new int[]{4,7,1,2,4});

        f2("abc");
        f2("abc",10);
        f2("abc",10,30);
        f2("abc",10,30,20);
    }

    // 可变长度参数的语法
    public static void f1(int... a){
        System.out.println(a.length);
    }

    // 如果一个方法中如果定义了可变长度参数，这个可变长参数只能放到参数列表的最后一位
    // public static void f2(int... a, String b){};
    public static void f2(String b, int... a){}

    // 一个方法中的可变长度参数只能有一个
    // public static void f3(String... b, int... a){}
}
