package com.bjpowernode.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用匿名内部类创建Callable接口对象来实现线程
 */
public class Test06 {
    public static void main(String[] args) {
        Callable c = new Callable() {
            @Override
            public Object call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    System.out.println("匿名内部类实现Callable: " + i);
                }
                return true;
            }
        };
        FutureTask ft = new FutureTask(c);
        new Thread(ft).start();

        try {
            Object o = ft.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程：" + i);
        }

    }
}
