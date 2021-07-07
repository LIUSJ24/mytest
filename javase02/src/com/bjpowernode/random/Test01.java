package com.bjpowernode.random;

import java.util.Random;

/**
 * Random类
 * Math.random()：也能产生一个随机数，生成的随机数是在0-1之间的小数
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.创建Random类的对象
        Random ran = new Random();
        // 2.生成一个随机的整数
        // 没有指定范围的nextInt默认是从int数据的最小值和最大值范围之内生成
        int nextInt = ran.nextInt();
        System.out.println(nextInt);
        int nextInt1 = ran.nextInt(10);
        System.out.println(nextInt1);
        // 3.nextBoolean():生成一个随机的布尔值
        System.out.println(ran.nextBoolean());
        // 4.nextDouble()：生成一个随机的双精度的浮点数
        System.out.println(ran.nextDouble());
        // 5.nextFloat()：生成一个随机的单精度的浮点数
        System.out.println(ran.nextFloat());
        // 6.nextLong():生成一个随机的长整型
        System.out.println(ran.nextLong());

        // 7.Math.random():生成一个0-1（不包括1）范围之内随机的小数,如果是生成随机的小数，推荐用这种
        double random = Math.random();
        System.out.println(random);
    }
}
