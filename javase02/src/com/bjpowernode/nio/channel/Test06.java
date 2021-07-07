package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 两个通道之间直接交换数据
 */
public class Test06 {
    public static void main(String[] args) {
        String path = "D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md";
        String path1 = "D:\\a\\NIO课堂笔记5.md";
        try(FileChannel inChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get(path1),StandardOpenOption.WRITE,StandardOpenOption.CREATE)
        ) {
            // 把inChannel中的数据交换到outChannel中
            // outChannel.transferFrom(inChannel,0,inChannel.size());
            inChannel.transferTo(0,100,outChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
