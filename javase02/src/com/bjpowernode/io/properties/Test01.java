package com.bjpowernode.io.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 读取jdbc.properties文件中的内容
 * 使用原本的流的方式读取属性配置文件的时候，会把注释也读出来，需要对注释进行过滤，而且读出来的属性也是一段字符串。
 */
public class Test01 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/com/bjpowernode/io/properties/jdbc.properties")) {
            char[] chars = new char[100];
            int len = 0 ;
            while (( len = fr.read(chars)) != -1) {
                String str = new String(chars,0,len);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
