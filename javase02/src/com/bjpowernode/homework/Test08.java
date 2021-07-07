package com.bjpowernode.homework;

import java.util.Scanner;

/**
 * 7、从控制台输入一个文件名，判断该文件名是否为word格式，如果是，
 * 则判断该文件名长度是否合法（合法的文件名长度为1-10个字符）。
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个文件名：");
            String fileName = scanner.next();
            if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
                int last = fileName.lastIndexOf(".");
                String fName = fileName.substring(0, last);
                if (fName.length() < 1 || fName.length() > 10 ){
                    System.out.println("文件名称不合法");
                }
            }else {
                System.out.println("这不是一个word文件名称");
            }
        }

    }
}
