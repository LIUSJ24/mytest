package com.bjpowernode.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 基于TCP协议的聊天室---客户端
 * 1.发消息(主线程--负责发消息)
 * 2.收消息(分支线程--收消息)
 */
public class Client {

    public static void main(String[] args) {
        try {
            // 创建和服务器的连接
            Socket socket = new Socket(InetAddress.getLocalHost(),9999);
            // 获取输出流，用来发送消息
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            // 收消息
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            InputStream is = socket.getInputStream();
                            Scanner input = new Scanner(is);
                            System.out.println(input.nextLine());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                    }
                }
            }).start();
            // 主线程，负责发送消息
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个昵称：");
            String name = scanner.nextLine();
            ps.println(name);
            while (scanner.hasNext()) {
                ps.println(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
