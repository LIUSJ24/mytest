package com.bjpowernode.thread;

/**
 * sleep(long millis):让线程进行休眠指定的毫秒数
 */
public class Test08 {
    public static void main(String[] args) {
        MyThead1 mt = new MyThead1();
        mt.start();

        try {
            // 请问以下的方法是让哪个线程？主线程
            mt.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThead1 extends Thread {
    /**
     * 重写线程的run方法后，run方法中的异常只能进行捕获，不能抛出
     * 因为父类Thread中的run方法没有抛出异常，子类重写父类的方法的时候，子类的方法抛出的异常不能比父类范围广
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("分支线程：" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}