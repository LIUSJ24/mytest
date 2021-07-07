package com.bjpowernode.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader：文件字符输入流，用来读，一次性读取的是一个字符。
 * 字符流只能读写文本文件。
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.建立内存和文件之间的管道
        FileReader fr = null;
        try {
            long begin = System.currentTimeMillis();
            fr = new FileReader("D:\\course\\02-JavaSE\\02-课堂笔记\\05-IO流\\IO流课堂笔记.md");
            // 2.调用读取的方法
            int len = 0;
            int count = 0;
            while ((len = fr.read()) != -1) {
                count++;
                System.out.print((char) len);
            }
            long end = System.currentTimeMillis();
            System.out.println("while循环执行的次数：" + count);
            System.out.println("执行这段代码所用的时间：" + (end - begin));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭字符输入流
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
