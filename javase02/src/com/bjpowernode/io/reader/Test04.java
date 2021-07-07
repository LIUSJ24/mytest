package com.bjpowernode.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileReader和FileWriter实现文本文件的复制
 * 字符流只能操作文本文件
 */
public class Test04 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // 1.建立内存和文件之间的管道
            fr = new FileReader("D:\\course\\02-JavaSE\\课后练习题.docx");
            fw = new FileWriter("D:/a/课后练习题.docx");
            char[] chars = new char[100];
            int len = 0;
            // 2.从源文件中读取内容，放入到数组
            while (( len = fr.read(chars)) != -1) {
                // 3.讲读取到数组中的数据写入目标文件
                fw.write(chars,0,len);
            }
            // 4.刷新输出流
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
