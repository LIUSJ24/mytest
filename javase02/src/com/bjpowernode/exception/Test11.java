package com.bjpowernode.exception;

public class Test11 {

    public static void main(String[] args) throws BalanceNotEnoughException {
        subMoney(3000);
    }

    public static void subMoney(double money) throws BalanceNotEnoughException {
        double balance = 2000;
        if (money > balance) {
            // ���㣬�׳�һ���쳣
            /**
             * �׳�һ���쳣���裺
             * ��һ��������һ���쳣����
             * �ڶ�����ʹ��throw�ؼ����׳�����쳣����
             * ��������ʹ��throws�ؼ����ڷ���������λ�����׳�����쳣��
              */
            BalanceNotEnoughException exception = new BalanceNotEnoughException("����");
            throw exception;
        }else {
            System.out.println("ȡ��ɹ�����ǰ����ǣ�" + (balance - money));
        }
    }
}
