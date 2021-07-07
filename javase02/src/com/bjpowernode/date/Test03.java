package com.bjpowernode.date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Calendar日历类
 * 1.是一个抽象类，所以不能用new创建对象
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.获取日历类对象getInstance()
        Calendar c = Calendar.getInstance();
        // 2.add(int field, int amount)
        // 要计算10年后的日期
        c.add(Calendar.YEAR,10);
        System.out.println(c.getTime());
        // 计算10年前的日期
        c.add(Calendar.YEAR,-10);
        System.out.println(c.getTime());
        c.add(Calendar.FRIDAY,10);
        System.out.println(c.getTime());
        System.out.println(c.getTime());
        c.add(Calendar.DATE,10);
        // 3.clear():清空日期,这个方法会让日期回到1970-1-1 0:0:0
        // c.clear();
        System.out.println(c.getTime());
        // 4.get(int field)
        int i = c.get(Calendar.YEAR);
        System.out.println(i);
        // 在西方的日历中，月份的范围是0-11
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONDAY));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH ));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        // 5.getTimeInMillis():获取毫秒数
        System.out.println(c.getTimeInMillis());
        // 6.set(int field, int value)
        c.set(Calendar.YEAR,2009);
        System.out.println(c.getTime());
        c.set(2010,10,3);
        System.out.println(c.getTime());
        c.set(2012,11,5,10,40,34);
        System.out.println(c.getTime());
        // 7.setTime(Date date)
        c.setTime(new Date());
        System.out.println(c.getTime());
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        c.setTimeZone(tz);

    }
}
