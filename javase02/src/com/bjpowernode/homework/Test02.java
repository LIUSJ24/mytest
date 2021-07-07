package com.bjpowernode.homework;

import java.util.Scanner;

/**
 * 1、给定一个字符串如下
 * String str="abcqwabcedcxabcuabcjkabcnmbabc";
 * 从控制台输入一个字符，统计该字符在str中出现的次数。
 * indexOf("a")
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "abcqwabcedcxabcuabcjkabcnmbabc";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要检索的字符：");
        String next = scanner.next();
        int count = 0;
        int fromIndex = 0;
        int lastIndex = str.lastIndexOf(next);
        while (fromIndex <= lastIndex) {
            int index = str.indexOf(next, fromIndex);
            fromIndex = index + 1;
            count++;
        }
        System.out.println("字符" + next + "在str中出现了" + count + "次");
    }

}
