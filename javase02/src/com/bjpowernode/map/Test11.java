package com.bjpowernode.map;

import java.util.Properties;

/**
 * Properties集合
 * Properties配置文件，叫做属性配置文件，属性配置文件后缀名就是.properties
 */
public class Test11 {
    public static void main(String[] args) {
        // 1.创建Properties集合对象
        Properties pro = new Properties();
        // 2.添加元素
        pro.put(10,20);
        // 3.setProperty(String key, String value):设置属性
        pro.setProperty("20","张三");
        // 4.getProperty(String key):通过key值获取value值
        String property = pro.getProperty("20");
        System.out.println(property);
    }
}
