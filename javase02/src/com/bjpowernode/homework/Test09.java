package com.bjpowernode.homework;

/**
 * 8、有一个字符串“我爱编程，编程让我快乐！”，截取该字符串逗号之后的内容，并获取截取之后新字符串的长度。
 */
public class Test09 {
    public static void main(String[] args) {
        String str = "我爱编程，编程让我快乐！";
        int index = str.indexOf("，");
        String substring = str.substring(index + 1);
        System.out.println("截取后的新字符串：" + substring);
        System.out.println("新字符串的长度：" + substring.length());
    }
}
