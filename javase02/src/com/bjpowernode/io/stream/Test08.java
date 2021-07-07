package com.bjpowernode.io.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStream：BOS对象，带有缓冲区的字节输出流。
 */
public class Test08 {
    public static void main(String[] args) {
        // 1.创建BOS对象
        BufferedOutputStream bos = null;
        try {
            // fos是节点流，bos是包装流
            FileOutputStream fos = new FileOutputStream("src/com/bjpowernode/io/stream/text.txt",true);
            bos = new BufferedOutputStream(fos);
            // 2.写内容
            bos.write("我是带有缓冲区的字节输出流".getBytes());
            // 3.输出流一定要刷新
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
