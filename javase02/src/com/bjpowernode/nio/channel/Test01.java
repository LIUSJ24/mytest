package com.bjpowernode.nio.channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * FileChannel通道获取的方式：3种
 * 1.在Java中，支持通道的类提供了getChannel的方法，比如传统的IO，RandomAccessFile
 * 2.JDK1.7之后，在FileChannel类中提供了静态方法open()
 * 3.JDK1.7之后，在Files工具类中提供了静态方法newByteChannel()
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.getChannel
            FileInputStream fis = new FileInputStream("D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md");
            FileChannel channel = fis.getChannel();
            // 2.FileChannel.open()
            FileChannel channel1 = FileChannel.open(Paths.get("D:/a/a.txt"),
                    StandardOpenOption.READ, StandardOpenOption.WRITE);
            // 3.newByteChannel()
            FileChannel channel2 =
                    (FileChannel) Files.newByteChannel(Paths.get("D:/a/a.txt"), StandardOpenOption.READ);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
