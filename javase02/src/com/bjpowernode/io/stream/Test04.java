package com.bjpowernode.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream的追加模式
 */
public class Test04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 创建FOS对象的时候，如果第二个参数为true，表示的就是追加模式
            fos = new FileOutputStream("D:/a/b.txt",true);
            fos.write("我是追加的内容".getBytes());
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
