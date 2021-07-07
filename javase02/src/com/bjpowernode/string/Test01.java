package com.bjpowernode.string;

import java.nio.charset.Charset;

/**
 * String类的构造方法
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        // 1.String()
        String str = new String();
        // 2.String(byte[] bytes)
        byte[] bytes = {65,66,67,68,69,70};
        String str1 = new String(bytes);
        System.out.println(str1);       // ABCDEF
        // 3.String(byte[] bytes, Charset charset)
        String str2 = new String(bytes, Charset.forName("GBK"));
        System.out.println(str2);
        // 4.String(byte[] bytes, int offset, int length)
        String str3 = new String(bytes,2,3,"GBK");
        System.out.println(str3);
        // 5.String(char[] value)
        char[] chars = {'a','b','c'};
        String str4 = new String(chars);
        System.out.println(str4);
        // 6.String(String original)
        String str5 = new String("今天是星期四！");
        String str6 = "今天是星期四！";
    }
}
