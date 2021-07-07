package com.bjpowernode.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream和FileOutputStream来完成文件的复制
 * 1.读取源文件中的内容，先放到内存中
 * 2.将内存中的内容写入目标文件
 * 3.字节流是万能的流，任何类型的文件都可以复制
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.建立内存和2个文件之间的管道
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\course\\02-JavaSE\\02-课堂笔记\\05-IO流\\流的概念.png");
            fos = new FileOutputStream("D:/a/流的概念.png");
            // 2.从输入管道中读取内容
            byte[] bytes = new byte[100];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                // 3.把内存中的数据写入目标文件
                fos.write(bytes,0,len);
            }
            // 4.刷新输出流
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭2个管道
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
