package com.bjpowernode.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate：本地日期类
 * 这个类获取的日期只有年月日，没有时分秒
 */
public class Test04 {
    public static void main(String[] args) {
        // 1.获取类对象
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // 2.atTime(int hour, int minute, int second) 
        LocalDateTime localDateTime = now.atTime(10, 10, 10);
        System.out.println(localDateTime);
        // 3.format(DateTimeFormatter formatter)
        // 2021-03-19  --> 2021/03/19
        // 这个类没有构造方法，所以无法用new关键字创建对象
        // ofPattern(String pattern)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = now.format(dtf);
        System.out.println(format);
        // 4.getMonth()
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        // 5.of(int year, int month, int dayOfMonth)
        LocalDate of = LocalDate.of(2020, 10, 10);
        System.out.println(of);
        // 6.parse(CharSequence text)：将一个字符串转换为LocalDate对象
        String str = "2001-03-15";
        LocalDate parse = LocalDate.parse(str);
        System.out.println(parse);
        String str1 = "2012/02/15";
        LocalDate parse1 = LocalDate.parse(str1, dtf);
        System.out.println(parse1);
        // 7.withYear(int year)：修改年份
        LocalDate localDate = of.withYear(2003);
        System.out.println(localDate);
        // 8.withMonth(int month):修改月份
        LocalDate localDate1 = localDate.withMonth(3);
        System.out.println(localDate1);


    }
}
