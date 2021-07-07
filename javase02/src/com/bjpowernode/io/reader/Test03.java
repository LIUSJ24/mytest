package com.bjpowernode.io.reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter：文件字符输出流，用来写文本文件。
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.建立内存和硬盘文件之间的管道
        FileWriter fw = null;
        try {
            fw = new FileWriter("src\\com\\bjpowernode\\io\\reader\\chars.txt");
            // 2.通过管道向文件中写入内容
            fw.write(97);
            fw.write("我爱编程！");
            fw.write(new char[]{'a','b','c'});
            fw.write("今天是星期五，可惜还要上班！",7,7);
            fw.write(new char[]{'x','y','z'},1,1);
            // 3.刷新管道
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
