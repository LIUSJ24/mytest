package com.bjpowernode.io.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * DataInputStream:DIS对象，用来读取8种基本数据类型和字符串
 * 从文件中读取数据的时候，读取的顺序必须和写入的顺序保持一致，否则数据会产生错乱
 */
public class Test10 {
    public static void main(String[] args) {
        // 1.创建DIS对象
        try(FileInputStream fis = new FileInputStream("src/com/bjpowernode/io/stream/data.txt");
            DataInputStream dis = new DataInputStream(fis)) {
            // 2.从文件中读取9个变量
            byte b = dis.readByte();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean b1 = dis.readBoolean();
            char c = dis.readChar();
            String s1 = dis.readUTF();
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(b1);
            System.out.println(c);
            System.out.println(s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
