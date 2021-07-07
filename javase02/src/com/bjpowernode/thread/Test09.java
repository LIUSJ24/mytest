package com.bjpowernode.thread;

/**
 * 打断线程的休眠/唤醒线程
 * interrupt():打断休眠依靠的是异常处理机制，该方法会让线程的sleep()方法抛出异常。
 */
public class Test09 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.setName("t线程");
        t.start();

        try {
            // 5秒后打断
            Thread.sleep(5000);
            // 打断正在休眠的线程
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread {
    public void run(){
        // 休眠1天
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("捕获到异常了");
            e.printStackTrace();
        }
    }
}