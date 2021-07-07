package com.bjpowernode.io.reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * PrintWriter
 * 这个流带有自动刷新功能，可以通过构造方法的第二个参数对自动刷新的模式进行设置，
 * 如果第二个参数设置为false，自动刷新功能就关闭了
 */
public class Test10 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("D:/a/d.txt");
                PrintWriter pw = new PrintWriter(fos,false)) {
            pw.write(97);
            pw.write("97");
            // pw.write(false);
            pw.print("97");
            pw.println(97);
            pw.println(false);
            pw.append("97");
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
