package com.bjpowernode.thread;

/**
 * 使用匿名内部类创建Runnable接口对象实现线程
 */
public class Test03 {
    public static void main(String[] args) {
        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("匿名内部类实现的线程：" + i);
                }
            }
        };
        Thread t = new Thread(runnable);
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}
