package com.bjpowernode.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 2、从键盘上输入身份证号, 判断出生日期,性别
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个身份证号：");
            String idCard = scanner.next();
            if (idCard.length() != 18) {
                System.out.println("您输入的身份证号无效！");
            }else {
                // 从身份证中截取出生日期 110223 19991209 6665
                String birthdate = idCard.substring(6, 14);
                // 将日期进行格式化
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                Date date = sdf.parse(birthdate);
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                String format = sdf1.format(date);
                System.out.println("出生日期是：" + format);

                // 判断性别
                char c = idCard.charAt(idCard.length() - 2);
                int i = c;
                if (i % 2 == 0) {
                    // 偶数
                    System.out.println("这个身份证号是一个女生");
                }else {
                    System.out.println("这个身份证号是一个男生");
                }

            }
        }
    }
}
