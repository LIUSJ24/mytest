package com.bjpowernode.thread.homework;

/**
 * 2、启动3个线程，这3个线程的名称分别是A,B,C，在控制台交替打印三个线程的名字输出100次
 * A count = 1
 * B count = 2
 * C count = 3
 * A count = 4
 * B count = 5
 * C count = 6
 * ....
 * count = 1 4 7的时候打印A   对3求余数是1
 *          2 5 8的时候B执行  对3求余数是2
 *          3 6 9的时候C执行  对3求余数是0
 */
public class Test03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintThread(1),"A");
        Thread t2 = new Thread(new PrintThread(2),"B");
        Thread t3 = new Thread(new PrintThread(0),"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
class PrintThread implements Runnable {

     static int count = 1;

     int no;

     public PrintThread(int no) {
         this.no = no;
     }

    @Override
    public void run() {
        synchronized (PrintThread.class) {
            while (count <= 300) {
                if (count % 3 == no) {
                    System.out.println(Thread.currentThread().getName());
                    count++;
                }else {
                    try {
                        PrintThread.class.notifyAll();
                        PrintThread.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("===="+Thread.currentThread().getName());
        }
    }
}