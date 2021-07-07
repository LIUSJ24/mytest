package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用DatagramChannel完成两台电脑之间的文件传输
 */
public class Test08 {
    public static void main(String[] args) {
        //server();
        client();
    }

    public static void client(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.需要将本地文件中的内容读取出来放入缓冲区
        String path = "D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md";
        try(FileChannel inChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
            DatagramChannel dChannel = DatagramChannel.open()) {
            int len = 0;
            while ((len = inChannel.read(buf)) != -1){
                buf.flip();
                // 3.将缓冲区中的数据封装成一个数据包
                //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
                DatagramPacket dp = new DatagramPacket(buf.array(),len);
                // 4.将封装好的数据包发送出去
                dChannel.send(buf,new InetSocketAddress("localhost",9999));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void server(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.接收客户端发送过来的数据包
        String path = "D:/a/NIO课堂笔记6.md";
        try(DatagramChannel dChannel = DatagramChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get(path),StandardOpenOption.WRITE,StandardOpenOption.CREATE)
        ) {
            dChannel.bind(new InetSocketAddress(9999));
            dChannel.receive(buf);
            // 在控制台输出接受的数据
            buf.flip();
            byte[] bytes = new byte[buf.limit()];
            buf.get(bytes);
            String str = new String(bytes);
            System.out.println(str);
            // 3.将数据包保存在本地文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
