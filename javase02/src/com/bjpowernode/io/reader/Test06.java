package com.bjpowernode.io.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter：带有缓冲区的字符输出流，用来写入文本文件。
 */
public class Test06 {
    public static void main(String[] args) {
        // 1.创建BufferedWriter对象
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("D:/a/a.txt");
            bw = new BufferedWriter(fw);
            // 2.调用写的方法写数据
            bw.write(97);
            bw.write("我是带有缓冲区的字符输出流！");
            bw.write(new char[]{'x','y','z'});
            // 3.刷新输出流
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
