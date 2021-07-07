package com.bjpowernode.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream：万能的流，任何类型的文件都可以读取
 */
public class Test02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 对于输入流而言，一定要保证文件是存在的，否则代码会抛出异常
            fis = new FileInputStream("D:\\course\\02-JavaSE\\02-课堂笔记\\05-IO流\\IO流课堂笔记.md");
            byte[] bytes =  new byte[100];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                String str = new String(bytes,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 为了保证文件无论如何都能关闭，一般把关闭流的代码写在finally中
            if (fis != null ) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
