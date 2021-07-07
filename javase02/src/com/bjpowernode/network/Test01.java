package com.bjpowernode.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL类：代表了一个网址
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/s?cl=3&tn=baidutop10&fr=top1000&wd=%E4%BA%91%E5%8D%97%E6%96%B0%E5%A2%9E15%E4%BE%8B%E7%A1%AE%E8%AF%8A&rsv_idx=2&rsv_dl=fyb_n_homepage&hisfilter=1");
            System.out.println(url.getAuthority());
            System.out.println(url.getContent());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getQuery());
            System.out.println(url.getUserInfo());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
