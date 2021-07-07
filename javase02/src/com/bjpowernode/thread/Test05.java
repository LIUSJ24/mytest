package com.bjpowernode.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程的第三种创建方式，这种方式线程的方法有返回值
 */
public class Test05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc =  new MyCallable();
        FutureTask ft = new FutureTask(mc);
        Thread t = new Thread(ft);
        t.start();

        // 接收mc线程的返回值
        // get()方法叫让主线程阻塞，主线程需要等待分支线程执行完毕，然后将返回值返回
        // get()方法是让当前线程阻塞，就是get方法写在那个线程中，那个线程就阻塞
        Object o = ft.get();
        System.out.println(o);

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}
class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程的第三种创建方式：" + i);
        }
        return 10;
    }
}