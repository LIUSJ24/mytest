package com.bjpowernode.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用相对路径操作文件
 * 相对路径：相对于当前的开发工具而言，当前的项目就是跟目录，如果脱离了当前的开发工具，就找不到了,
 *  使用相对路径有一个条件，就是这个文件必须是放在当前项目中的
 * 绝对路径：就是从计算机的磁盘上找，放到任何地方都能够找到
 */
public class Test06 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 使用绝对路径建立管道
            // fis =  new FileInputStream("D:\\course\\02-JavaSE\\01-code\\javase02\\src\\com\\bjpowernode\\io\\stream\\text.txt");
            // 使用相对路径建立管道
            // fis = new FileInputStream("src\\com\\bjpowernode\\io\\stream\\text.txt");
            fis = new FileInputStream("javase02.iml");
            byte[] bytes = new byte[10];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                String str = new String(bytes,0,len);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
