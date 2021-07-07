package com.bjpowernode.string;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        // 创建了2个对象，1个在字符串常量池中，一个在堆中
        String s3 = new String("abc");
        System.out.println(s1 == s2);   // true
        System.out.println(s1 == s3);   // false
        s1 = "def";

    }
}
