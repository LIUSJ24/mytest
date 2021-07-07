package com.bjpowernode.thread;

/**
 * 线程的第一种创建方式
 * 1.写一个类，继承Thread类
 * 2.重写Thread类的run方法，这个run方法相对于main方法，是一个入口方法。
 * 3.线程执行start方法和执行run方法结果是不一样的，
 *  start方法的作用是在虚拟机中开辟一个新的栈空间，栈空间开辟完成后，start方法就结束了
 *  run方法的话，就只是普通的方法调用，不会去开辟栈空间，也不会开启新的线程，执行run方法就是单线程。
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.创建线程对象
        MyThread mt = new MyThread();
        // 2.启动线程
        mt.start();

        // 3.在主线程中执行for循环
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}
class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("第一个线程：" + i);
        }
    }
}