package com.bjpowernode.thread.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.text.DecimalFormat;

/**
 * 3、启动2个线程，实现2个文件的同步复制，并且在控制台输入复制的进度，
 * 进度以百分比显示，比如"复制了10%".... "复制完成"。
 */
public class Test04 {
    public static void main(String[] args) {
        String srcPath1 = "D:\\course\\02-JavaSE\\03-课堂视频\\09-注解\\01-注解的定义及使用.avi";
        String destPath1 = "D:/a/01-注解的定义及使用.avi";
        String srcPath2 = "D:\\course\\02-JavaSE\\03-课堂视频\\09-注解\\02-JDK内置注解和元注解.avi";
        String destPath2 = "D:/a/02-JDK内置注解和元注解.avi";
        FileCopy fc = new FileCopy(srcPath1, destPath1);
        FileCopy fc2 = new FileCopy(srcPath2, destPath2);
        Thread t1 = new Thread(fc);
        Thread t2 = new Thread(fc2);
        t1.start();
        t2.start();
    }
}
class FileCopy implements Runnable {

    String srcPath;
    String destPath;

    public FileCopy(String srcPath, String destPath) {
        this.srcPath = srcPath;
        this.destPath = destPath;
    }

    @Override
    public void run() {
        File srcFile =  new File(srcPath);
        File destFile =  new File(destPath);
        try(FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile)) {
            long total = srcFile.length();
            byte[] bytes = new byte[100];
            int read = 0;
            double size = 0;
            DecimalFormat df = new DecimalFormat("##%");
            while ((read = fis.read(bytes)) != -1) {
                size += read;
                fos.write(bytes,0,read);
                double d = size / total;
                String format = df.format(d);
                System.out.println(srcFile.getName() + "复制了" + format);
            }
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
