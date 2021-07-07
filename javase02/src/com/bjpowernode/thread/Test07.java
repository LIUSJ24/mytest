package com.bjpowernode.thread;

/**
 * 线程的常用方法
 */
public class Test07 {
    public static void main(String[] args) {
        MyRunnable1 mr = new MyRunnable1();
        Thread t = new Thread(mr);
        // 1.activeCount()
        int count = Thread.activeCount();
        System.out.println(count);
        // 2.currentThread():返回当前的线程对象
        Thread thread = Thread.currentThread();
        // 3.destroy():销毁线程
        // t.destroy();
        // 4.getContextClassLoader():获取类加载器对象
        ClassLoader classLoader = thread.getContextClassLoader();
        // 5.getId():获取当前线程的id唯一标识
        System.out.println(t.getId());
        System.out.println(thread.getId());
        // 6.getName():获取当前线程的名称
        System.out.println(t.getName());
        System.out.println(thread.getName());
        Thread t1 = new Thread(mr);
        System.out.println(t1.getName());
        // 7.setName(String name):设置线程的名称
        t.setName("订单的线程");
        t1.setName("物流的线程");
        System.out.println(t.getName());
        System.out.println(t1.getName());
        // 8.isAlive():判断线程对象是否活着
        System.out.println(t.isAlive());
        System.out.println(t1.isAlive());
        System.out.println(thread.isAlive());
        // 9.isDaemon():判断一个线程是否是守护线程（后台线程）
        System.out.println(t.isDaemon());
        System.out.println(t1.isDaemon());
        System.out.println(thread.isDaemon());
        // 10.isInterrupted() :判断一个线程是否被中断
        System.out.println(t.isInterrupted());
        System.out.println(t1.isInterrupted());
        System.out.println(thread.isInterrupted());
    }
}
class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程：" + i);
        }
    }
}