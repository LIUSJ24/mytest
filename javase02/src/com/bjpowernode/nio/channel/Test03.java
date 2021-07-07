package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用NIO向本地文件中写入内容
 */
public class Test03 {
    public static void main(String[] args) {
       // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        FileChannel channel = null;
        try {
            // 2.获取通道
            channel = FileChannel.open(Paths.get("D:/a/a.txt"), StandardOpenOption.WRITE,StandardOpenOption.CREATE);
            // 3.把数据保存在缓冲区
            buf.put("我是NIO写入的内容".getBytes());
            // 4.翻转缓冲区
            buf.flip();
            // 5.向通道中写入缓冲区的数据
            channel.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
