package com.bjpowernode.nio.channel;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用NIO完成文件的复制
 */
public class Test04 {
    public static void main(String[] args) {
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        // 2.获取通道
        String path = "D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md";
        String path1 = "D:\\a\\NIO课堂笔记.md";
        try(FileChannel inChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get(path1),StandardOpenOption.WRITE,StandardOpenOption.CREATE)) {
            // 3.从源文件中读取内容
            int read = 0;
            while ((read = inChannel.read(buf)) != -1) {
                // 4.翻转缓冲区
                buf.flip();
                // 5.将缓冲区中的内容写入目标文件
                outChannel.write(buf);
                // 6.清空缓冲区
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
