package com.bjpowernode.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڸ�ʽת��
 * y:���
 * M:�·�
 * d:��
 * H:24Сʱ�Ƶ�Сʱ
 * h:12Сʱ�Ƶ�Сʱ
 * m:����
 * s:����
 * S:����
 * a:PM/AM
 * z:ʱ��
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        // ��һ��Date����ת��ΪString�����ת���ַ�������ʽû��Ҫ�󣬿����������ⶨ��
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss SSS");
        String format = sdf.format(date);
        System.out.println(format);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a");
        System.out.println(sdf2.format(date));

        // ��һ���ַ���ת��ΪDate�����ת����ʽ����Ҫ��ģ�������ַ����ĸ�ʽ����һ��
        String str = "2021-10-01";
        // ������ת���ĸ�ʽ���ַ����ĸ�ʽ��һ�£����׳��޷�ת�����쳣Unparseable date: "2021-10-01"
        //SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf3.parse(str);
        System.out.println(parse);

    }
}
