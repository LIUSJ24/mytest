package com.bjpowernode.decimal;

import java.math.BigDecimal;

/**
 * 1、问题：浮点数直接运算的话，会造成精度丢失
 * 2、原因：3（十进制） -- 10（二进制）,计算机执行程序是以二进制运行的，而十进制在转换为二进制的时候，没有办法完全相等，
 * 只能是无限接近于，所以在运算的时候有可能会产生误差。
 * 3、解决方案：大数字BigDecimal类
 */
public class decimal {
    public static void main(String[] args) {
        System.out.println(0.2 + 0.1);      // 0.3
        System.out.println(0.3 - 0.2);      // 0.1

        // 1.将参与运算的浮点数先转换成大数字
        BigDecimal b1 = new BigDecimal(0.2);
        // BigDecimal(String val):推荐使用这种构造方法
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal b3 = new BigDecimal(String.valueOf(0.1));
        // 2.调用BigDecimal类中提供的加法方法add()
        BigDecimal add = b2.add(b3);
        System.out.println(add);
        // 3.减法
        BigDecimal b4 = new BigDecimal(String.valueOf(0.3));
        BigDecimal subtract = b4.subtract(b2);
        System.out.println(subtract);
        // 4.乘法
        BigDecimal multiply = b4.multiply(b2);
        System.out.println(multiply);
        // 5.除法（10/5 ,10/3）
        BigDecimal b5 = new BigDecimal(String.valueOf(10));
        BigDecimal b6 = new BigDecimal(String.valueOf(5));
        BigDecimal b7 = new BigDecimal(String.valueOf(3));
        // 只有一个参数的divide方法，适用于刚好被整除的时候
        BigDecimal divide = b5.divide(b6);
        System.out.println(divide);
        // 如果不能被整除
        /**
         * 第一个参数：除数
         * 第二个参数：希望保留的小数点位数
         * 第三个参数：四舍五入的模式
         */
        BigDecimal divide1 = b5.divide(b7, 5, BigDecimal.ROUND_UP);
        System.out.println(divide1);

    }
}
