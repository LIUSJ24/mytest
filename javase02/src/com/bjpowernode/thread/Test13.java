package com.bjpowernode.thread;

/**
 * 线程的优先级
 * 1.获取线程的优先级,优先级的范围是1-10,线程的默认优先级是5
 * 2.线程类中提供了3个优先级的常量
 * Thread.MAX_PRIORITY=10 是最大优先级 Thread.MIN_PRIORITY=1 最低优先级 Thread.NORM_PRIORITY=5默认优先级
 * 3.优先级不能改变线程抢夺CPU的概率，改变的是抢到了CPU后时间会变多（不是每次都变多，时间表多的概率变大）。
 */
public class Test13 {
    public static void main(String[] args) {
        MyRunnable3 mr = new MyRunnable3();
        Thread t1 = new Thread(mr);
        // 1.获取线程的优先级
        int priority = t1.getPriority();
        System.out.println(priority);
        // 2.设置线程的优先级
        // t1.setPriority(10);
        t1.setName("最大优先级");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(mr);
        t2.setName("默认优先级");
        Thread t3 = new Thread(mr);
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.setName("最低优先级");

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
