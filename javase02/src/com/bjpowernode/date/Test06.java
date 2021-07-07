package com.bjpowernode.date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime类：本地日期时间类，这个类获取的日期，即有年月日也有时分秒
 */
public class Test06 {
    public static void main(String[] args) {
        // 1.获取LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 2.format(DateTimeFormatter formatter):对日期进行格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = now.format(dtf);
        System.out.println(format);
        // 3.of(int year, int month, int dayOfMonth, int hour, int minute)
        LocalDateTime of = LocalDateTime.of(2003, 10, 9, 12, 34, 30);
        System.out.println(of);
        // 4.parse(CharSequence text):将一个字符串转换为LocalDateTime对象
        String str = "2008-10-09T12:30:10";
        LocalDateTime parse = LocalDateTime.parse(str);
        System.out.println(parse);
        String str1 = "2007/12/30 12:40:34";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime parse1 = LocalDateTime.parse(str1, dtf1);
        System.out.println(parse1);
        // 5.withYear(int year):修改年份
        LocalDateTime localDateTime = parse1.withYear(2017);
        System.out.println(localDateTime);
    }
}
