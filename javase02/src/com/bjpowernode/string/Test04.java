package com.bjpowernode.string;

/**
 * 字符串的拼接
 * String类又称为字符串常量池，因为底层数组被final修改，所以每次拼接的时候，都会生成一个新的字符串，会产生大量不必要的
 * 中间字符串，浪费资源。所以在涉及到大量字符串拼接的时候，不建议使用String。
 */
public class Test04 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 0; i < 1000; i++) {
            str += "a";
            System.out.println(str);
        }
    }
}
