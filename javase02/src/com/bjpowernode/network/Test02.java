package com.bjpowernode.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress：代表的是IP地址
 */
public class Test02 {
    public static void main(String[] args) {
        // 动态获取本机电脑的IP地址
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println(localHost.getHostAddress());
            System.out.println(localHost.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
