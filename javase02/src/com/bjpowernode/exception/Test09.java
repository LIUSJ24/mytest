package com.bjpowernode.exception;

/**
 * finally������ʹ��
 * 1.�����ܵ�������,���������try{}����
 * 2.try{}�����Ҳ���ܵ���ʹ�ã�����������һ��catch��finally,����������Ҳ��
 * 3.���catch��finallyͬʱ���֣�finally�������catch�ĺ���
 * 4.������û�з����쳣�������쳣��û�б��ɹ�����finally�еĴ���һ����ִ�С�
 */
public class Test09 {
    public static void main(String[] args) {
        try{
            System.out.println(10/ 0);
        } finally {
            System.out.println("���յĴ���");
        }
        System.out.println("try֮��Ĵ���");
    }
}
