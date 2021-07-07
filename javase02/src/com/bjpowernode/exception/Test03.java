package com.bjpowernode.exception;

/**
 * 异常的存在形式
 */
public class Test03 {
    public static void main(String[] args) {
        // 创建要给空指针异常的对象
        NullPointerException exception = new NullPointerException("发生了空指针异常");
        System.out.println(exception);
    }
}
