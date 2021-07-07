package com.bjpowernode.homework;

/**
 * 5、翻转字符串中的单词顺序，如“hello world”变成“world hello”
 */
public class Test06 {
    public static void main(String[] args) {
        String str = "hello world";
        String[] s = str.split(" ");

        String newStr = s[1] + " " + s[0];
        System.out.println(newStr);

    }
}
