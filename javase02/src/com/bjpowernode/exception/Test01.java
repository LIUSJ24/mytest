package com.bjpowernode.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译期异常：代码还没有运行，在编译的时候就发生了异常，编译期的异常必须要处理的
 * 运行时异常：代码编译没有问题，但是在运行的时候抛出了异常，运行时异常可以不处理
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        String str = "2020-10-09";
        // 将字符串转换为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);

        String str1 = null;
        System.out.println(str1.length());
    }
}
