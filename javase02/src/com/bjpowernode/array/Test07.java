package com.bjpowernode.array;

import java.util.Arrays;

/**
 * main�����еĲ���String[] args�Ǹ�ʲô�õ�?
 *  1��args�������û������õ�
 *  2���û���ô���������main������
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println(args.length);
        // String[] args = {};
        // У���û�����ݣ���������֤ͨ�����Ϳ���ִ�к����Ĵ��룬����Ļ�����ִ��
        // ����ϵͳָ�����û�����admin 123456
        String username = args[0];
        String password = args[1];
        if (!"admin".equals(username)) {
            System.out.println("�û���������");
            return;
        }
        if (!"123456".equals(password)) {
            System.out.println("���벻��ȷ");
            return;
        }
        System.out.println("�����֤ͨ��������ִ�к����Ĵ���");
    }
}
