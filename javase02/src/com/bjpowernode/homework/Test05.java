package com.bjpowernode.homework;

/**
 * 4、有一个字符串String str = "我44ab55c爱661.q 编程！";将该字符串中的数字和字母以及汉字提取出来。
 */
public class Test05 {
    public static void main(String[] args) {
        String str = "我44ab55c爱661.q 编程！";
        char[] chars = str.toCharArray();
        String en = "";
        String ch = "";
        String num = "";
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 48 && c <= 57) {
                num += c;
            }else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                en += c;
            }else {
                ch += c;
            }
        }
        System.out.println("这个字符串中的数字为：" + num);
        System.out.println("这个字符串中的字母为：" + en);
        System.out.println("这个字符串中的汉字为：" + ch);

    }
}
