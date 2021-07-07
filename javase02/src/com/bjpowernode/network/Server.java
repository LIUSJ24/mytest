package com.bjpowernode.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 基于TCP协议的聊天室---服务器端
 * 1.需要有一个List集合，来存储所有客户端和服务器端建立的连接
 */
public class Server {

    public static void main(String[] args) {
        Server server = new Server();
        server.startup();
    }

    List<ServerThread> list = new ArrayList<>();

    public void startup(){
        try {
            // 创建服务器的端点
            ServerSocket ss = new ServerSocket(9999);
            while (true) {
                Socket socket = ss.accept();
                // 客户端成功的和服务器建立连接后，需要启动线程
                ServerThread st = new ServerThread(socket);
                new Thread(st).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class ServerThread implements Runnable {

        Socket socket;
        PrintStream ps;
        InputStream is;
        String name;

        public ServerThread(Socket socket) {
            this.socket = socket;
            try {
                ps = new PrintStream(socket.getOutputStream());
                is = socket.getInputStream();
                // 接收客户端的昵称
                Scanner input = new Scanner(is);
                name = input.nextLine();
                System.out.println(name + "进入聊天室");
                // 发送进入的消息给聊天室中的所有的人
                sendMsg(name + "进入聊天室");
                list.add(this);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public void sendMsg(String msg){
            for(ServerThread st : list){
                st.ps.println(msg);
                st.ps.flush();
            }
        }

        @Override
        public void run() {
            Scanner input1 = new Scanner(is);
            while (true) {
                String s = input1.nextLine();
                System.out.println(name + ":" + s);
                // 服务器要把接收到的消息转发给所有聊天室中的客户端
                sendMsg(name + ":" + s);
            }
        }
    }
}
