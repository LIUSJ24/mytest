package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用NIO从本地文件中读取内容
 * 1.缓冲区：存储数据
 * 2.通道：传输数据
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        FileChannel channel = null;
        try {
            // 2.获取通道
            channel = FileChannel.open(Paths.get("D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md"), StandardOpenOption.READ);
            // 3.调用读的方法来读取文件中的内容
            int read = 0;
            while ((read = channel.read(buf)) != -1) {
                // 4.翻转缓冲区
                buf.flip();
                // 5.把缓冲区的数据输出在控制台
                byte[] array = buf.array();
                String str = new String(array);
                System.out.print(str);
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭通道
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
