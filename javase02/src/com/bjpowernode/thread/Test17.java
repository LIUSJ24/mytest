package com.bjpowernode.thread;

/**
 * 守护线程：后台线程
 * 一般是一个死循环，只要用户线程结束，守护线程被迫结束
 */
public class Test17 {
    public static void main(String[] args) {
        MyThread8 t1 = new MyThread8();
        MyThread9 t2 = new MyThread9();
        t1.setName("t1线程");
        t2.setName("t2线程");
        // 将t2设置为守护线程
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
class MyThread8 extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyThread9 extends Thread {
    public void run(){
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}