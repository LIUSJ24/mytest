package com.bjpowernode.io.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader
 * FileReader中提供了3个read方法：
 * read()
 * read(char[] chars):建议使用这个，因为这个执行效率比较高
 * read(char[] chars,int off,int len)
 * 处理文件文件优先选择字符流，文本文件说白了就是保存字符串的文件。
 */
public class Test02 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            long begin = System.currentTimeMillis();
            fr = new FileReader("D:\\course\\02-JavaSE\\02-课堂笔记\\05-IO流\\IO流课堂笔记.md");
            char[] chars = new char[100];
            int len = 0;
            int count = 0;
            while ((len = fr.read(chars)) != -1) {
                    String str = new String(chars,0,len);
                    System.out.print(str);
                    count++;
            }
            long end = System.currentTimeMillis();
            System.out.println("while循环执行的次数：" + count);
            System.out.println("执行这段代码所用的时间：" + (end - begin));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
