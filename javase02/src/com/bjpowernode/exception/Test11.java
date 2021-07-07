package com.bjpowernode.exception;

public class Test11 {

    public static void main(String[] args) throws BalanceNotEnoughException {
        subMoney(3000);
    }

    public static void subMoney(double money) throws BalanceNotEnoughException {
        double balance = 2000;
        if (money > balance) {
            // 余额不足，抛出一个异常
            /**
             * 抛出一个异常步骤：
             * 第一步：创建一个异常对象
             * 第二步：使用throw关键字抛出这个异常对象
             * 第三步：使用throws关键字在方法声明的位置上抛出这个异常类
              */
            BalanceNotEnoughException exception = new BalanceNotEnoughException("余额不足");
            throw exception;
        }else {
            System.out.println("取款成功，当前余额是：" + (balance - money));
        }
    }
}
