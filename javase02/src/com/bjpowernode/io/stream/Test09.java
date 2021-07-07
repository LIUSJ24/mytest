package com.bjpowernode.io.stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream:数据输出流，将java中的带有数据类型的数据写入文件
 */
public class Test09 {
    public static void main(String[] args) {
        // 1.创建DataOutputStream DOS对象
        try(FileOutputStream fos = new FileOutputStream("src\\com\\bjpowernode\\io\\stream\\data.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {
            // 2.在文件中保存一些数据
            byte b = 10;
            short s = 20;
            int i = 30;
            long l = 200;
            float f = 3.6f;
            double d = 3.14;
            boolean bl = false;
            char c = 'a';
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(bl);
            dos.writeChar(c);
            dos.writeUTF("我是字符串");
            // 3.刷新
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
