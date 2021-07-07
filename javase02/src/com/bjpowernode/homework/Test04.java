package com.bjpowernode.homework;

/**
 * 3、将一个手机号码15234557878的中间4位替换为*
 */
public class Test04 {
    public static void main(String[] args) {
        String phone = "15234553455";
        // 先把中间的4位截取出来
        String mid = phone.substring(3, 7);
        String s = phone.replaceFirst(mid, "****");
        System.out.println(s);
    }
}
