package com.bjpowernode.decimal;

import java.text.DecimalFormat;

/**
 * DecimalFormat类：数字格式化转换
 * 0.78 转换为百分数
 * 100000000以千分位显示
 * 12345以小数的形式显示，并且保留5位小数点，位数不够补0
 *
 * DecimalFormat类中的符号：
 * 0 代表的就是0
 * # 代表的是任意的数字
 * .小数点
 * - 负号
 * , 千分位
 * E 科学计数法
 * % 百分数
 * (\u00A4) 货币符号
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.DecimalFormat(String pattern):构造一个指定格式的格式对象
        DecimalFormat df = new DecimalFormat("##.#%");
        // 2.0.78 转换为百分数
        String format = df.format(0.789);
        System.out.println(format);
        // 3.100000000以千分位显示
        DecimalFormat df1 = new DecimalFormat("###,###,###");
        String format1 = df1.format(100000000);
        System.out.println(format1);
        // 4.12345以小数的形式显示，并且保留5位小数点，位数不够补0
        DecimalFormat df2 = new DecimalFormat("#####.00000");
        String format2 = df2.format(12345);
        System.out.println(format2);
        // 5.9999后面加上货币符号
        DecimalFormat df3 = new DecimalFormat("####\u00A4");
        String format3 = df3.format(9999);
        System.out.println(format3);
    }
}
