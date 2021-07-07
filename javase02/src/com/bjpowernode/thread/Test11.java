package com.bjpowernode.thread;

/**
 * 合理的终止一个线程
 */
public class Test11 {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();

        try {
            // 5秒后终止
            Thread.sleep(5000);
            // 将线程的isRun属性修改为false
            t.isRun = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread4 extends Thread {

    public boolean isRun = true;

    public void run(){
        try {
            if (isRun) {
                // Thread.sleep(24 * 60 * 60 * 1000);
                System.out.println(Thread.currentThread().getName() + ":" + 1);
            }else {
                // 可以先做保存数据的操作
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}