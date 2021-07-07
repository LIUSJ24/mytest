package com.bjpowernode.io.reader;

import java.io.*;

/**
 * InputStreamReader:转换流，将字节流转换为字符流
 */
public class Test07 {
    public static void main(String[] args) {
        Reader isr = null;
        try {
            InputStream fis = new FileInputStream("D:/a/a.txt");
            isr = new InputStreamReader(fis,"UTF-8");
            char[] chars = new char[100];
            int len = 0;
            while (( len = isr.read(chars)) != -1) {
                String str = new String(chars,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
