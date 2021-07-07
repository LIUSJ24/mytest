package com.bjpowernode.thread.ThreadSafe;

/**
 * 使用同步方法实现线程同步机制
 */
public class Test03 {
}
class AccountThread2 extends Thread {

    Account2 account;

    public AccountThread2(Account2 account) {
        this.account = account;
    }
    public void run(){
        // 取款
        account.subMoney(2000);
    }
}
class Account2 {
    private double balance;

    public Account2(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    // 取款的方法
    /**
     * 同步方法：是对方法中的所有代码进行同步，默认是去找this对象的锁
     * 同步方法的弊端
     * 1.不能指定共享对象，默认了是去找this的锁，所以它的代码就没有同步代码快灵活
     * 2.同步方法是对方法中的所有代码加锁，它的同步范围就比较大
     * 3.如果同步的方法是一个静态方法，那么线程同步的时候找的就不是this对象的锁，而是当前类的类锁。
     * 4.类锁：Java中每一个类都有一个把，不管有几个对象，类锁只有一把
     * @param money
     */
    public synchronized void subMoney(double money){
        // 查询余额是否足够
        double before = this.balance;
        try {
            // 加休眠模拟修改余额的时候慢了一步
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (before >= money) {
            // 修改余额
            double after = before - money;
            this.setBalance(after);
            System.out.println(Thread.currentThread().getName() + ":取款成功，余额为" + after);
        }else {
            // 余额不足
            System.out.println(Thread.currentThread().getName() + ":余额不足");
        }
    }
}