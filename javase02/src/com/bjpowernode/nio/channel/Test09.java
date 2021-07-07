package com.bjpowernode.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用选择器实现非阻塞式通信
 */
public class Test09 {
    public static void main(String[] args) {
        //server();
         client();
    }
    // 客户端
    public static void client(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.读取从控制台输入的内容
        Scanner scanner = new Scanner(System.in);
        // 3.建立和服务器的连接
        try(SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1",9999))) {
            // 将通道设置为非阻塞模式
            sChannel.configureBlocking(false);
            // 4.循环接收键盘的输入
            while (scanner.hasNext()) {
                // 5.将键盘输入的内容保存进缓冲区
                String next = scanner.next();
                buf.put(next.getBytes());
                // 6.翻转缓冲区
                buf.flip();
                // 7.发送缓冲区的数据给服务器
                sChannel.write(buf);
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 服务器端
    public static void server(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.打开服务器端的通道
        try(ServerSocketChannel ssChannel = ServerSocketChannel.open()) {
            // 3.将服务器端的通道绑定到一个端口号上
            ssChannel.bind(new InetSocketAddress(9999));
            // 4.将服务器端的通道设置为非阻塞模式
            ssChannel.configureBlocking(false);
            // 5.获取选择器
            Selector selector = Selector.open();
            // 6.将通道注册到选择上
            ssChannel.register(selector, SelectionKey.OP_ACCEPT);
            // 7.轮询式的查询选择上注册的通道
            while (selector.select() > 0) {
                Set<SelectionKey> sk = selector.selectedKeys();
                // 8.遍历集合，根据不同通道的功能，分配不同的任务
                Iterator<SelectionKey> it = sk.iterator();
                while (it.hasNext()){
                    SelectionKey key = it.next();
                    if (key.isAcceptable()) {
                        // 9.接收客户端的请求
                        // ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                         SocketChannel accept = ssChannel.accept();
                        // 10.切换为非阻塞式模式
                        accept.configureBlocking(false);
                        // 11.将客户端的通道注册在选择器
                        accept.register(selector,SelectionKey.OP_READ);
                    }else if(key.isReadable()){
                        // 13.分配读取的工作
                        SocketChannel channel = (SocketChannel) key.channel();
                        int len = 0;
                        while (channel.read(buf) != 0) {
                            // 14.将读取到的内容显示在控制台上
                            buf.flip();
                            byte[] array = buf.array();
                            String str = new String(array);
                            System.out.println(str);
                            // 15.清空缓冲区
                            buf.clear();
                        }
                    }
                    // 16.取消选择器
                    it.remove();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
