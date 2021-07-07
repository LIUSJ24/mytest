package com.bjpowernode.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *   通过Calendar类打印日历
 *
 *    思路：
 *      1. 解决月份的最大天数 ？
 *         calendar有 api
 *         int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
 *
 *     2.  一号是星期几 ？
 *        2.1 设置日期为1 号
 *        2.2 获取一号是周几
 *        2.3 打印对应的空格
 *
 *     3. 周日换行
 *         3.1 拿到每一天是周几
 *         3.2 判断周日换行
 *
 *     4. 打印 键盘输入的日期
 *         4.1 拿到键盘输入的字符串
 *         4.2 把字符串转成date
 *         4.3 把date设置到calendar中就好
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        try {
            printCalendar();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    /**
     * 打印日历
     */
    private static void printCalendar() throws ParseException {

        // 拿到键盘输入的字符串
        System.out.println("请输入日期:(yyyy-MM)");
        Scanner sc = new Scanner(System.in);
        String timeStr = sc.nextLine();

        // 把字符串转成date
        Date date = new SimpleDateFormat("yyyy-MM").parse(timeStr);

        //创建calendar
        Calendar calendar = Calendar.getInstance();

        // 把date设置到calendar中就好
        calendar.setTime(date);


        //  2.1 设置日期为1 号
        calendar.set(Calendar.DAY_OF_MONTH,1);
        //  2.2 获取一号是周几
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("dayOfweek = " + dayOfweek);
        // 拿到月份的最大天数
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("maxDay = " + maxDay);

        System.out.println("一\t二\t三\t四\t五\t六\t日\t");

        for(int i = 2; i <dayOfweek ; i ++){
            System.out.print("\t");
        }

        for (int i = 1;  i<= maxDay; i ++) {
            System.out.print(i + "\t");

            // 3.1 拿到每一天是周几
            int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);

            // 周日换行
            if (day_of_week == Calendar.SUNDAY){
                System.out.println();
            }

            // 加一天
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }
    }

}
