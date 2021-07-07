package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 使用SocketChannel和ServerSocketChannel完成两台电脑之间的文件传输
 * 1.有2台电脑，一台电脑充当客户端，另一台充当服务器端
 * 2.建立客户端和服务器的通道
 * 3.客户端发送一个文件到网络通道，客户端先读取本地文件内容，然后把读取到的内容发送到网络通道
 * 4.服务器读取网络通道中的内容，然后写入本地文件
 */
public class Test07 {
    public static void main(String[] args) {
         //server();
         client();
    }
    // 模拟客户端
    public static void client(){
        String path = "D:\\course\\02-JavaSE\\02-课堂笔记\\06-NIO\\NIO课堂笔记.md";
        // 1.获取通道（2个通道，一个本地通道：用来读取本地文件的内容，另一个是网络通道：用来把数据发送到网络中）
        // 192.168.137.1
        try(FileChannel inChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
            SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost",9999))) {
            // 2.分配缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);
            // 3.从本地文件中读取内容存入缓冲区
            int len = 0;
            while ((len = inChannel.read(buf)) != -1) {
                // 4.翻转缓冲区
                buf.flip();
                // 5.将缓冲区中的数据写入网络通道
                socketChannel.write(buf);
                // 6.清空缓冲区
                buf.clear();
            }

            // 手动关闭输出流
            socketChannel.shutdownOutput();

            // 7.接收服务器发送过来的反馈信息
            int read = 0;
            while ((read = socketChannel.read(buf)) != -1) {
                // 8.在控制台输出服务器发送的消息
                buf.flip();
                byte[] array = buf.array();
                String str = new String(array,0,read);
                System.out.println(str);
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 模拟服务器端
    public static void server(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        // 2.获取通道（2个通道，一个是网络通道：用来读取客户端发送的内容，本地通道：用来将客户端发送的内容保存在本地）
        try(FileChannel outChannel = FileChannel.open(Paths.get("D:/a/a.txt"),StandardOpenOption.WRITE,StandardOpenOption.CREATE);
            ServerSocketChannel ssc = ServerSocketChannel.open()) {
            // 3.绑定端口号
            ssc.bind(new InetSocketAddress(9999));
            // 4.接收客户端的连接
            SocketChannel socketChannel = ssc.accept();
            // 5.从网络通道中读取客户端发送的内容
            int len = 0;
            while ((len = socketChannel.read(buf)) != -1) {
                // 6.翻转缓冲区
                buf.flip();
                // 7.将缓冲区中的内容写入本地文件
                outChannel.write(buf);
                // 8.清空缓冲区
                buf.clear();
            }

            // 9.文件接收成功后，向客户端发送反馈信息
            buf.put("文件传输成功".getBytes());
            // 10.将缓冲区的数据写入到网络通道
            buf.flip();
            socketChannel.write(buf);
            buf.clear();
            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
