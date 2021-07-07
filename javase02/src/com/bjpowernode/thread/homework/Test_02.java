package com.bjpowernode.thread.homework;

public class Test_02 {
    public static void main(String[] args) {
     MyThread1 M1=new MyThread1();
     MyThread2 M2=new MyThread2();
     MyThread3 M3=new MyThread3();
     M1.setName("A");
     M2.setName("B");
     M3.setName("C");
     M1.start();
     M2.start();
     M3.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
            for (int i = 0; i <5 ; i++) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }

        }
    }
class MyThread2 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}class MyThread3 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}
