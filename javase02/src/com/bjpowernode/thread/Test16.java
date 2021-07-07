package com.bjpowernode.thread;

import java.util.Objects;

/**
 * 死锁
 */
public class Test16 {
    public static void main(String[] args) {
        Object  obj1 = new Object();
        Object  obj2 = new Object();
        MyThread6 t1 =  new MyThread6(obj1,obj2);
        MyThread7 t2 =  new MyThread7(obj1,obj2);
        t1.setName("t1线程");
        t2.setName("t2线程");
        t1.start();
        t2.start();
    }
}
class MyThread6 extends Thread {
    Object obj1;
    Object obj2;

    public MyThread6(Object obj1,Object obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void run(){
        synchronized (obj1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 碰到这个关键字后，t1线程需要找obj2的锁，但是obj2的锁被线程t2占有了，所以t1只能在锁池中等待
            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

}
class MyThread7 extends Thread {
    Object obj1;
    Object obj2;
    public MyThread7(Object obj1,Object obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void run(){
        synchronized (obj2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 碰到这个关键字，需要去找obj1的锁，obj1的锁已经被t1占有了，所以t2现在也只能在锁池中等待
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}