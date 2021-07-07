package com.bjpowernode.exception;

import java.text.ParseException;

/**
 * 异常可以一直上抛，最终会被抛出main方法，main方法会将异常抛给虚拟机，虚拟机接收到异常后
 * 中断程序的执行
 */
public class Test06 {
    public static void main(String[] args) throws ParseException {
        f1();
    }

    public static void f1() throws ParseException {

    }
}
