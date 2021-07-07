package com.bjpowernode.homework;

/**
 * 10、有一个字符串“username=zhangsan&password=123456”,
 * 提取出字符串中的用户名值“zhangsan”和密码“123456”，并和系统默认的用户名“admin”，
 * 密码“123456”进行比较，如果用户名和密码不正确，进行提示。
 */
public class Test10 {
    public static void main(String[] args) {
        String param = "username=admin&password=123456";
        String[] split = param.split("&");
        String[] split1 = split[0].split("=");
        String username = split1[1];
        String[] split2 = split[1].split("=");
        String password = split2[1];
        if (!"admin".equals(username)) {
            System.out.println("用户名不正确");
            return;
        }
        if (!"123456".equals(password)) {
            System.out.println("密码不正确");
            return;
        }

    }
}
