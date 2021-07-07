package com.bjpowernode.thread.ThreadSafe.exam4;

public class Test01 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyThread t1 = new MyThread(mc1);
        MyThread t2 = new MyThread(mc2);
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
    // t1线程执行m1方法的时候，碰到了synchronized，但是由于该方法是静态方法，所以t1线程去找当前类的类锁，找到之后占有
    public static synchronized void m1(){
        System.out.println("m1方法开始执行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1方法执行结束");
    }
    // t2线程执行m2方法的时候，碰到了synchronized，但是由于是静态方法 ，所以t2线程去找当前类的类锁，由于类锁只有一把，
    // 已经被t1占有了，所以t2找不到，所以t2只能在锁池中等待。
    public static synchronized void m2(){
        System.out.println("m2方法开始执行");
        System.out.println("m2方法执行结束");
    }
}