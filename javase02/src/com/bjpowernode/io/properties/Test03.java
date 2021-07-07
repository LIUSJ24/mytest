package com.bjpowernode.io.properties;

import java.util.ResourceBundle;

/**
 * 使用资源绑定器（ResourceBundle）读取属性配置文件
 * 1.资源绑定器只能读取属性配置文件，只能读.properties结尾的文件
 * 2.使用资源绑定器读取的属性配置文件，必须放在类路径下
 * 3.类路径：当前项目的src路径,src是类路径的跟路径
 * 4.使用资源绑定器读取属性配置文件的时候，文件名最后的后缀名.properties不能写
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.获取资源绑定器的对象
        ResourceBundle bundle = ResourceBundle.getBundle("com/bjpowernode/io/properties/jdbc");
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        System.out.println(username + "," + password);
    }
}
