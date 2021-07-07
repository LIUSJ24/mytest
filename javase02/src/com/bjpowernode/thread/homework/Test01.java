package com.bjpowernode.thread.homework;

/**
 * 1、写两个线程，让这两个线程在控制台交替输入1-100；
 * 线程A:1
 * 线程B:2
 * 线程A:3
 * 线程B:4
 * .....
 */
public class Test01 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(printer,"A");
        Thread t2 = new Thread(printer,"B");
        t1.start();
        t2.start();
    }
}
class Printer implements Runnable {

    int count = 1;

    @Override
    public void run() {
        synchronized (Printer.class) {
            while (count <= 100) {
                String name = Thread.currentThread().getName();
                // 判断count是奇数还是偶数，如果是奇数，就应该是A线程执行，如果进来的是B，就等待
                if (count % 2 == 1) {
                    // 奇数
                    if (name.equals("A")) {
                        // 就让线程执行
                        System.out.println("线程" + name + ":" + count);
                        count++;
                    } else {
                        try {
                            Printer.class.notify();
                            Printer.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    // 偶数
                    if (name.equals("B")) {
                        System.out.println("线程" + name + ":" + count);
                        count++;
                    }else {
                        try {
                            Printer.class.notify();
                            Printer.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }
}
