package com.bjpowernode.thread.ThreadSafe;

/**
 * 使用同步代码块解决多个线程同时取款产生的数据安全问题
 */
public class Test02 {
    public static void main(String[] args) {
        Account1 account = new Account1(2000);
        AccountThread1 t1 = new AccountThread1(account);
        AccountThread1 t2 = new AccountThread1(account);

        Account1 account1 = new Account1(5000);
        AccountThread1 t3 = new AccountThread1(account1);


        t1.setName("存折");
        t2.setName("卡");

        t3.setName("李四的卡");

        t1.start();
        t2.start();

        t3.start();
    }
}
class AccountThread1 extends Thread {

    Account1 account;

    public AccountThread1(Account1 account) {
        this.account = account;
    }
    public void run(){
        // 取款
        // 如果同步代码块写在这里，会扩大同步代码的范围，同步的范围变大后，排队等待的时间就长
//        synchronized (account) {
//        }
        account.subMoney(2000);
    }
}
class Account1 {
    private double balance;

    Object obj = new Object();

    public Account1(double balance) {
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
    public void subMoney(double money){
        /**
         * synchronized代码块，将有可能会发生数据安全问题的代码放入大括号中
         * synchronized小括号中的参数，应该传两个线程共享的对象
         * 1.对象锁：在Java中，每个对象都有且仅有一把锁
         * 2.同步原理：两个线程同时进入执行该方法后，第一个线程先碰到synchronized关键字后，会去寻找this对象的锁，
         * 找到之后就占有这把锁，这个时候第二个线程进来的时候，也碰到了synchronized关键字，也去循环this
         * 对象的锁，但是由于锁已经被第一个线程占有了，它找不到锁，这样的话第二个线程就会在锁池中进行等待。
         * 等到第一个线程执行完后自动释放对象锁，第二个线程就可以拿到这把锁，就可以继续执行后面的代码。
         * 3.同步代码块中的代码应该尽可能的少，这样可以减少同步范围，从而减少排队的时间，提高代码执行的效率。
         */
       // synchronized (this){
        // 以下代码是不能实现同步的，因为obj对象是一个局部变量，局部变量多线程之间不共享
//        Object obj = new Object();
//        synchronized (obj){
        // 以下代码是可以实现线程同步的，因为obj是Account1类的成员变量，成员变量一个对象有一个份。
//        synchronized (obj){
        // 以下代码是可以实现线程同步的，因为"abc"是保存在方法区中，方法区是两个线程共享的。
        // 但是这种方式会让所有的线程排队,所以这种方式也不建议写
        //synchronized ("abc"){
        synchronized(this){
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
}