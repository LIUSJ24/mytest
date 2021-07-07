package com.bjpowernode.exception;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的第一种处理方式：使用throws关键字抛出
 * 1.throws关键字的使用位置，是在方法声明的位置上，写在右小括号之后，左大括号之前
 * 2.throws关键字抛出的异常，必须和被调用的方法抛出的异常保持一致，或者抛出方法异常的父类
 * 3.throws关键字可以在方法声明的位置上抛出多个异常，多个异常直接以逗号隔开
 * 4.当一个方法中抛出了多个异常，在抛出的时候，可以直接抛出一个异常的父类
 */
public class Test05 {

    public static void main(String[] args) throws ParseException, UnsupportedEncodingException {
        String str = "2020-10-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);

        byte[] bytes = new byte[10];
        String str1 =  new String(bytes,0,10,"GBK");
    }
}
