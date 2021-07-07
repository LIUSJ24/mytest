package com.bjpowernode.thread;

/**
 * 线程合并join：让两个并行执行的线程变为串行，两个线程需要排队执行。
 */
public class Test15 {
    public static void main(String[] args) {
        MyRunnable6 mr = new MyRunnable6();
        Thread t = new Thread(mr,"t线程");
        t.start();

        try {
            // join方法会让当前的线程阻塞，也就是当前线程等待，当前线程排在后面
            // join方法合并线程的同时，会合并栈空间
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyRunnable6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}