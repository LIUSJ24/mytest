package com.bjpowernode.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式转换
 * y:年份
 * M:月份
 * d:日
 * H:24小时制的小时
 * h:12小时制的小时
 * m:分钟
 * s:秒数
 * S:毫秒
 * a:PM/AM
 * z:时区
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        // 将一个Date对象转换为String，这个转换字符串个格式没有要求，可以自已随意定义
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss SSS");
        String format = sdf.format(date);
        System.out.println(format);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a");
        System.out.println(sdf2.format(date));

        // 将一个字符串转换为Date，这个转换格式是有要求的，必须和字符串的格式保持一致
        String str = "2021-10-01";
        // 如果这个转换的格式和字符串的格式不一致，会抛出无法转换的异常Unparseable date: "2021-10-01"
        //SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf3.parse(str);
        System.out.println(parse);

    }
}
