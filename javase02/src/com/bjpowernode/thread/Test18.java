package com.bjpowernode.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者模式和消费者模式
 * 1.需要有2个线程
 * 2.需要一个仓库，假如使用List集合模拟仓库，默认仓库的容量是5
 */
public class Test18 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Producer pro = new Producer(list);
        Consumer con = new Consumer(list);
        pro.setName("生产者线程");
        con.setName("消费者线程");
        pro.start();
        con.start();
    }
}
// 生产者线程
class Producer extends  Thread {
    List list;
    public Producer(List list) {
        this.list = list;
    }
    public void run() {
        // 负责生产，如果仓库满了，生产者线程就不能继续生产了，就需要等待wait,通过消费者，可以进行消费了
        while (true) {
            synchronized (list) {
                if (list.size() >= 1) {
                    // 证明仓库满了，当前线程就要等待了
                    try {
                        list.notify();
                        // wait方法会让当前线程放弃还没有用完的时间，同时释放对象锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    // 仓库还没有满，可以继续生产
                    Object o = new Object();
                    list.add(o);
                    System.out.println(Thread.currentThread().getName() + ":" + o);
                }
            }
        }
    }
}
// 消费者线程
class Consumer extends Thread {
    List list;
    public Consumer(List list) {
        this.list = list;
    }
    public void run(){
        while (true) {
            // 负责消费，当仓库空了后，消费者线程就不能继续消费了，就需要通知生产者线程开始生产
            synchronized (list) {
                if (list.size() <= 0) {
                    // 证明仓库空了，那么消费者线程就该等待了
                    try {
                        list.notify();
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    // 仓库里有元素，可以进行消费
                    Object o = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + ":" + o);
                }
            }
        }
    }
}