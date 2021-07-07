package com.bjpowernode.thread;

/**
 * 代码合并实现线程
 */
public class Test04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("代码合并的线程：" + i);
                }
            }
        }).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }

    }
}
