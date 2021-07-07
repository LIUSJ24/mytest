package com.bjpowernode.thread.ThreadSafe.exam1;

/**
 * 面试题：t2线程执行m2方法的时候，需不需要等t1先执行完m1方法？
 */
public class Test01 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        try {
            // 休眠1秒，保证t1线程一定先执行
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
class MyThread extends Thread {
    MyClass mc;
    public MyThread(MyClass mc) {
        this.mc = mc;
    }
    public void run (){
        if (Thread.currentThread().getName().equals("t1")) {
            mc.m1();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.m2();
        }
    }
}
class MyClass {
    public synchronized void m1(){
        System.out.println("m1方法开始执行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1方法执行结束");
    }
    public void m2(){
        System.out.println("m2方法开始执行");
        System.out.println("m2方法执行结束");
    }
}