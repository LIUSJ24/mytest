package com.bjpowernode.io.reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter：转换流，将字节输出流转换为字符输出流
 */
public class Test08 {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        try {
            FileOutputStream fos = new FileOutputStream("D:/a/a.txt");
            osw = new OutputStreamWriter(fos);
            osw.write("我是转换流");
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
