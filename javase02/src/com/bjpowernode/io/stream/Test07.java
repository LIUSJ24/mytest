package com.bjpowernode.io.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * BufferedInputStream：BIS对象，带有缓冲区的字节输入流。输入流只能用来做读操作。
 */
public class Test07 {
    public static void main(String[] args) {
        // 1.建立内存和文件之间的管道
        BufferedInputStream bis = null;
        try {
            /**
             * 构造BIS对象的时候，需要一个InputStream作为参数，
             * 这个作为参数传入的流叫做节点流，构建之后的流叫做包装流/处理流
              */
            FileInputStream fis = new FileInputStream("D:\\course\\javase\\资料\\java常用单词表.txt");
            bis = new BufferedInputStream(fis);
            // 2.通过管道读取内容
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                String str = new String(bytes,0,len);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭的时候，只需要关闭最外层的包装流就可以，节点流会自动关闭
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
