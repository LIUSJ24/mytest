package com.bjpowernode.thread;

/**
 * 线程让位yield:一定会让位，让位之后，所有的线程再次重新抢
 */
public class Test14 {
    public static void main(String[] args) {
        MyRunnable4 mr = new MyRunnable4();
        Thread t = new Thread(mr);
        t.setName("t线程");
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyRunnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            // 当i是10的倍数的时候，让当前线程让位
            if (i % 10 == 0) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}