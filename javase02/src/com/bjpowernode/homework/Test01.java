package com.bjpowernode.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 模拟一个双色球抽奖系统
 * 1.红色的球池：01...33 从33个中随机抽取出6个，抽取出来的6个球不能重复
 * 2.蓝色的球池：01---07 随机抽取1个
 * 3.6个红色的球和1个蓝色的球组合成一个新数组
 */
public class Test01 {
    public static void main(String[] args) {
        String[] redBools = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33"};
        String[] blueBools = {"01","02","03","04","05","06","07"};
        String[] redResult = new String[6];
        String[] finalResult = new String[7];
        boolean[] redFlag = new boolean[redBools.length];
        Random ran =  new Random();
        for (int i = 0; i < 6; i++) {
            int index = 0;
            do{
                index = ran.nextInt(redBools.length);
            }while (redFlag[index]);
            // 条件不成立
            String redBool = redBools[index];
            redResult[i] = redBool;
            redFlag[index] = true;
        }
        // 抽取篮球
        int index2 = ran.nextInt(blueBools.length);
        String blueBool = blueBools[index2];
        // 将6个红球拷贝到最终的数组中
        System.arraycopy(redResult,0,finalResult,0,redResult.length);
        finalResult[finalResult.length - 1] = blueBool;
        System.out.println("本次双色球的开奖结果：");
        System.out.println(Arrays.toString(finalResult));
    }
}
