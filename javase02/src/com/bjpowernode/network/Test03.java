package com.bjpowernode.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 使用TCP协议完成网络编程--单向传输
 * 1.建立连接
 * 2.开始通信
 * 3.结束通信
 */
public class Test03 {
    public static void main(String[] args) {
        //server();
        client();
    }

    // 模拟客户端
    public static void client(){
        try {
            // 1.建立和服务器的连接
            Socket socket = new Socket(InetAddress.getLocalHost(),9999);
            // 2.向服务器发送消息
            Scanner scn = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            while (scn.hasNext()) {
                String s = scn.nextLine();
                os.write(s.getBytes());
                os.flush();
            }
            // 3.结束通信
            socket.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 模拟服务器
    public static void server(){
        try {
            // 1.建立连接
            ServerSocket ss = new ServerSocket(9999);
            // 2.接受客户端的请求
            Socket socket = ss.accept();
            // 3.读取客户端发送的消息
            InputStream is = socket.getInputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = is.read(bytes)) != -1) {
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
            // 4.结束通信，关闭资源
            ss.close();
            socket.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
