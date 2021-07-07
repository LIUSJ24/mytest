package com.bjpowernode.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        // 创建2个线程并启动
        Account account = new Account(2000);
        AccountThread t1 = new AccountThread(account);
        AccountThread t2 = new AccountThread(account);
        t1.setName("存折");
        t2.setName("卡");
        t1.start();
        t2.start();
    }
}
class AccountThread extends Thread {

    Account account;

    public AccountThread(Account account) {
        this.account = account;
    }
    public void run(){
        // 取款
        account.subMoney(2000);
    }
}
class Account {
    private double balance;

    public Account(double balance) {
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
    // 获取Lock锁对象
    Lock lock = new ReentrantLock();

    // 取款的方法
    public void subMoney(double money){
        // tryLock():判断当前线程是否获取了锁对象
        try{
            // 调用lock方法获取锁
            lock.lock();
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
        } finally {
            // 释放锁
            lock.unlock();
        }

    }
}