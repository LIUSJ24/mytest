package com.bjpowernode.exception;

/**
 * 自定义异常类
 * 第一步：写一个类继承异常的父类
 * 第二步：重写异常父类中的几个主要构造方法（一般写3个，一个无参的，一个带参）
 * 构造方法中不用写任何的逻辑代码
 */
public class BalanceNotEnoughException extends RuntimeException{

    public BalanceNotEnoughException() {
    }

    public BalanceNotEnoughException(String message) {
        super(message);
    }

    public BalanceNotEnoughException(Throwable cause) {
        super(cause);
    }
}
