package com.bjpowernode.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream：FOS对象，用来向文件中写入内容
 * 输出流有2种模式：覆盖（重写）模式和追加模式。
 * 覆盖模式：每次写数据的时候会把原来文件中的内容删除。
 * 追加模式：每次写数据的时候不会删除原来的内容，是在原来的内容后面去追加。
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.建立内存和硬盘文件之间的管道
        FileOutputStream fos = null;
        try {
            // 对于输出流，如果文件不存在，它会自动创建这个文件
            fos = new FileOutputStream("D:/a/b.txt");
            // 2.向管道中写入数据
            fos.write(97);
            fos.write("xyz".getBytes());
            fos.write("higklmn".getBytes(),2,3);
            // 3.刷新管道，如果不刷新，如果有可能留在管道中，这样的话文件中就会丢数据
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭管道
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
