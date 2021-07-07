package com.bjpowernode.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 使用TCP协议完成网络通信--双向传输
 * 1.注意事项：通过输出流写消息的时候，在消息的后面要写一个换行符。
 */
public class Test05 {
    public static void main(String[] args) {
        //server();
        client();
    }

    public static void client(){
        try {
            // 1.建立和服务器的连接
            Socket socket = new Socket(InetAddress.getLocalHost(),7777);

            // 2.获取输入输出流
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            Scanner input = new Scanner(is);

            // 3.获取键盘输入事件
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String msg = scanner.nextLine();
                os.write(msg.getBytes());
                os.write("\n".getBytes());
                os.flush();

                // 4.接收服务器发送过来的消息
                String s = input.nextLine();
                System.out.println("服务器说：" + s);
            }

            // 5.关闭资源
            os.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void server(){
        try {
            // 1.建立服务器的套接字，并且绑定到一个端口号上
            ServerSocket ss = new ServerSocket(7777);
            // 2.接受客户端的请求
            Socket socket = ss.accept();

            // 3.获取输入输出流
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            Scanner input = new Scanner(is);

            // 4.获取键盘事件
            Scanner scanner =  new Scanner(System.in);
            while (input.hasNext()) {
                System.out.println("客户端说：" + input.nextLine());

                // 5.服务器发送消息给客户端
                String s = scanner.nextLine();
                os.write(s.getBytes());
                os.write("\n".getBytes());
                os.flush();
            }
            // 6.关闭资源
            os.close();
            is.close();
            socket.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
