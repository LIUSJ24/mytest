package com.bjpowernode.io.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/**
 * 使用Properties集合的load方法来读取属性配置文件
 * 1.load()方法会自动将属性配置文件中的内容进行读取，并且放入到Properties集合中，读取的时候会自动过滤注释
 */
public class Test02 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/com/bjpowernode/io/properties/jdbc.properties")) {
            Properties pro = new Properties();
            pro.load(fr);
            System.out.println(pro);
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");
            System.out.println(username + "," + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
