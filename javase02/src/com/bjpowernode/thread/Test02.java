package com.bjpowernode.thread;

/**
 * 线程的第二种创建方式
 * 1.写一个类，实现了Runnable接口
 * 2.重写run方法
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.创建MyRunnable的对象
        MyRunnable mr = new MyRunnable();
        // 2.将mr对象封装成一个线程对象
        Thread t = new Thread(mr);
        // 3.启动线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}
// 当前类并不是一个线程类
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("第二个线程：" + i);
        }
    }
}