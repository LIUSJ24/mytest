package com.bjpowernode.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * FileInputStream:FIS对象，文件字节输入流，用来读取文件
 * 读取D:/a/a.txt中的内容
 * 1.需要建立内存和硬盘文件之间的管道
 * 2.读取，创建输入流对象
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.建立内存和文件之间的管道
            //FileInputStream fis = new FileInputStream("D:/a/a.txt");
            FileInputStream fis = new FileInputStream("D:\\a\\a.txt");
            // 2.通过管道读取数据
            // read():一次性读取一个字节并返回这个字节，如果读取到文件末尾，返回-1.
//            int read = fis.read();
//            System.out.println(read);
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
            int len = 0;
            // 使用循环读取文件中的全部内容
//            while ((len = fis.read()) != -1){
//                System.out.println(len);
//            }
            byte[] bytes = new byte[10];
//            fis.read(bytes);
//            System.out.println(Arrays.toString(bytes));
            fis.read(bytes,3,3);
            System.out.println(Arrays.toString(bytes));
            // 3.关闭流
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
