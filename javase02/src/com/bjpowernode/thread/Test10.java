package com.bjpowernode.thread;

/**
 * 停止一个线程
 * stop()
 */
public class Test10 {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start();

        try {
            // 5秒后停止线程
            Thread.sleep(5000);
            // 停止线程
            t.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread3 extends Thread {
    public void run(){
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}