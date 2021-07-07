package com.bjpowernode.io.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader：带有缓冲区的字符输入流，用来读取文本文件。
 */
public class Test05 {
    public static void main(String[] args) {
        // 1.创建BufferedReader对象
        BufferedReader br = null;
        try {
            // fr叫节点流，br叫包装流/处理流
            FileReader fr = new FileReader("src\\com\\bjpowernode\\io\\reader\\Test05.java");
            br = new BufferedReader(fr);
            // 2.调用读的方法
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭最外层的包装流即可，节点流会自动关闭
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
