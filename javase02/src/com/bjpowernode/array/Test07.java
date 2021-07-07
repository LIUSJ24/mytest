package com.bjpowernode.array;

import java.util.Arrays;

/**
 * main方法中的参数String[] args是干什么用的?
 *  1、args是留给用户输入用的
 *  2、用户怎么传入参数到main方法中
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println(args.length);
        // String[] args = {};
        // 校验用户的身份，如果身份验证通过，就可以执行后续的代码，否则的话不能执行
        // 假如系统指定的用户名是admin 123456
        String username = args[0];
        String password = args[1];
        if (!"admin".equals(username)) {
            System.out.println("用户名不存在");
            return;
        }
        if (!"123456".equals(password)) {
            System.out.println("密码不正确");
            return;
        }
        System.out.println("身份验证通过，可以执行后续的代码");
    }
}
