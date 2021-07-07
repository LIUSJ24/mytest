package com.bjpowernode.thread;

/**
 * 线程的生命周期
 */
public class Test12 {
    public static void main(String[] args) {
        MyRunnable2 mr = new MyRunnable2();
        Thread t = new Thread(mr);
        // 1.此时线程t处于新建状态
        System.out.println(t.getState());
        // 2.当线程执行了start方法
        t.setName("t线程");
        t.start();
        System.out.println(t.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
    }
}
class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + ":" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}