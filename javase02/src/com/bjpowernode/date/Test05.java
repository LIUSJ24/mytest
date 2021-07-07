package com.bjpowernode.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalTime：本地时间类，只有时分秒毫秒，没有年月日
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.获取LocalTime对象
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        // 2.atDate(LocalDate date)
        LocalDate localDate = LocalDate.of(2009, 10, 9);
        LocalDateTime localDateTime = localTime.atDate(localDate);
        System.out.println(localDateTime);
        // 3.format(DateTimeFormatter formatter)
        // 09:14:09.722 --> 09-14-09.722
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss-SSS");
        String format = localTime.format(dtf);
        System.out.println(format);
        // 4.getHour()：获取小时数
        System.out.println(localTime.getHour());
        // 5.of(int hour, int minute) :获取指定时分秒的时间对象
        LocalTime of = LocalTime.of(12, 10, 30);
        System.out.println(of);
        // 6.parse(CharSequence text):将一个字符串转换为LocalTime对象
        String str = "12:56:01";
        LocalTime parse = LocalTime.parse(str);
        System.out.println(parse);
        String str1 = "12&56&01";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH&mm&ss");
        LocalTime parse1 = LocalTime.parse(str1,dtf1);
        System.out.println(parse1);
        // 7.withHour(int hour) :将一个时间的小时进行设置
        LocalTime localTime1 = of.withHour(20);
        System.out.println(localTime1);



    }
}
