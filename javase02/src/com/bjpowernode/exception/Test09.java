package com.bjpowernode.exception;

/**
 * finally代码块的使用
 * 1.它不能单独出现,它必须跟在try{}后面
 * 2.try{}代码块也不能单独使用，它后面必须跟一个catch或finally,两个都出现也行
 * 3.如果catch和finally同时出现，finally必须放在catch的后面
 * 4.不管有没有发生异常，不管异常有没有被成功捕获，finally中的代码一定会执行。
 */
public class Test09 {
    public static void main(String[] args) {
        try{
            System.out.println(10/ 0);
        } finally {
            System.out.println("最终的代码");
        }
        System.out.println("try之后的代码");
    }
}
