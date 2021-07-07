package com.bjpowernode.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时任务
 */
public class TimerTest01 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        MyTask task = new MyTask();
        // schedule(TimerTask task, Date time):在指定的时间执行指定的任务
        String str = "2021-04-01 10:09:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //timer.schedule(task,date);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        timer.cancel();
        // schedule(TimerTask task, Date firstTime, long period)
        //timer.schedule(task,date,1000);
        // schedule(TimerTask task, long delay)
        // timer.schedule(task,2000);
        // schedule(TimerTask task, long delay, long period)
        timer.schedule(task,2000,1000);
    }
}
class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("取消订单");
    }
}