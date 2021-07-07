package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用直接缓冲区复制文件（内存映射文件）
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.获取2个通道
        String path = "D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md";
        String path1 = "D:\\a\\NIO课堂笔记2.md";
        try(FileChannel inChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get(path1),StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE)
        ) {
            // 2.使用内存映射文件获取2个直接缓冲区
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer buffer1 = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
            // 3.将buffer中的数据放入buffer1
            byte[] bytes = new byte[buffer.limit()];
            buffer.get(bytes);
            buffer1.put(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
