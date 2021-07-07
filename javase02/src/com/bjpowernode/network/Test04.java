package com.bjpowernode.network;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 使用UDP协议完成网络编程--单向传输
 * 1.开始通信
 * 2.结束通信
 */
public class Test04 {
    public static void main(String[] args) {
       // server();
        client();
    }

    // 模拟客户端
    public static void client(){
        try {
            // 1.建立客户端的套接字
            DatagramSocket ds = new DatagramSocket();
            // 2.发送消息出去(以数据包的形式发送)
            // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                // 3.将键盘输入的内容封装成一个数据包
                byte[] bytes = s.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8888);
                ds.send(dp);
            }
            // 4.关闭资源
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 模拟服务器
    public static void server(){
        try {
            // 1.建立服务器端的端点
            DatagramSocket ds = new DatagramSocket(8888);
            // 2.接受客户端发送过来的数据
            // DatagramPacket(byte[] buf, int length)
            byte[] bytes = new byte[10];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            String s = new String(bytes);
            System.out.println(s);
            // 3.关闭资源
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
