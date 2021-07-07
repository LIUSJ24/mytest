package com.bjpowernode.thread.homework;

public class Test02 {
    public static void main(String[] args) {
        Printer1 p1 = new Printer1(1);
        Printer1 p2 = new Printer1(0);
        Thread t1 = new Thread(p1,"A");
        Thread t2 = new Thread(p2,"B");
        t1.start();
        t2.start();
    }

}
class Printer1 implements Runnable {

    static int count = 1;

    int no;

    public Printer1(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        synchronized (Printer1.class) {
            while (count <= 100) {
                if (count % 2 == no) {
                    System.out.println("线程" + Thread.currentThread().getName() + ":" + count);
                    count++;
                }else {
                    try {
                        Printer1.class.notify();
                        Printer1.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}