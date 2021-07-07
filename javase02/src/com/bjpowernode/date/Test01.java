package com.bjpowernode.date;

import java.util.Date;

/**
 * Date类
 * 1.时间戳：指的从1970年1月1日0时0分0秒开始到现在（系统时间）之间的毫秒数
 * 2.如何获取时间戳？
 *  时间戳的获取有2种方式：System.currentTimeMillis()
 *                      Date类中getTime()
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.Date()
        Date date =  new Date();
        System.out.println(date);
        // 2.Date(int year, int month, int date)
        Date date1 = new Date(2009,10,1);
        System.out.println(date1);
        // 3.Date(long date)
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        long time = date.getTime();
        System.out.println(time);
        // 获取10分钟的日期
        long after = time + 10 * 60 * 1000;
        Date date2 = new Date(after);
        System.out.println(date2);
        // 4.after(Date when)
        boolean after1 = date2.after(date);
        System.out.println(after1);
        // 5.compareTo(Date anotherDate)
        int i = date.compareTo(date2);
        System.out.println(i);

    }
}
