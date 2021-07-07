package com.bjpowernode.nio.channel;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用DatagramChannel实现非阻塞式通信
 */
public class Test10 {
    public static void main(String[] args) {
       // server();
        client();
    }
    // 客户端
    public static void client(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.接收键盘输入
        Scanner scanner = new Scanner(System.in);
        try(DatagramChannel dChannel = DatagramChannel.open()) {
            // 将通道设置为非阻塞模式
            dChannel.configureBlocking(false);
            // 3.判断键盘是否有内容输入，如果有就发送给服务器
            while (scanner.hasNext()) {
                String next = scanner.next();
                // 4.将键盘输入的内容保存进缓冲区
                buf.put(next.getBytes());
                // 5.将缓冲区的数据封装成一个数据包
                buf.flip();
                // 6.发送数据包
                dChannel.send(buf,new InetSocketAddress("localhost",9999));
                // 7.清空缓冲区
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void server(){
        // 1.分配缓冲区
        ByteBuffer buf = ByteBuffer.allocate(100);
        // 2.创建服务器端的通道
        try(DatagramChannel dChannel = DatagramChannel.open()) {
            // 3.将服务器的通道绑定到一个端口号上
            dChannel.bind(new InetSocketAddress(9999));
            // 4.将通道设置为非阻塞模式
            dChannel.configureBlocking(false);
            // 5.获取选择器
            Selector selector = Selector.open();
            // 6.将服务器端的通道注册到选择器上
            dChannel.register(selector, SelectionKey.OP_READ);
            // 7.轮询式的查询选择器中的通道
            while (selector.select() > 0) {
                Set<SelectionKey> sk = selector.selectedKeys();
                Iterator<SelectionKey> it = sk.iterator();
                // 8.遍历Set集合
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    if (key.isReadable()) {
                        // 9.接受客户端发送过来的数据
                        DatagramChannel channel2 = (DatagramChannel)key.channel();
                        channel2.receive(buf);
                        buf.flip();
                        // 10.在控制台输入缓冲区的数据
                        byte[] array = buf.array();
                        String str =  new String(array);
                        System.out.println(str);
                        // 11.清空缓冲区
                        buf.clear();
                    }
                    // 12.取消选择器
                    it.remove();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
