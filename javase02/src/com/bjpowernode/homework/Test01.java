package com.bjpowernode.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * ģ��һ��˫ɫ��齱ϵͳ
 * 1.��ɫ����أ�01...33 ��33���������ȡ��6������ȡ������6�������ظ�
 * 2.��ɫ����أ�01---07 �����ȡ1��
 * 3.6����ɫ�����1����ɫ������ϳ�һ��������
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
            // ����������
            String redBool = redBools[index];
            redResult[i] = redBool;
            redFlag[index] = true;
        }
        // ��ȡ����
        int index2 = ran.nextInt(blueBools.length);
        String blueBool = blueBools[index2];
        // ��6�����򿽱������յ�������
        System.arraycopy(redResult,0,finalResult,0,redResult.length);
        finalResult[finalResult.length - 1] = blueBool;
        System.out.println("����˫ɫ��Ŀ��������");
        System.out.println(Arrays.toString(finalResult));
    }
}
