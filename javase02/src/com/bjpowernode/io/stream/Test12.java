package com.bjpowernode.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream：OIS对象，用来反序列化对象
 */
public class Test12 {
    public static void main(String[] args) {
        // 1.创建OIS对象
        try(FileInputStream fis = new FileInputStream("src\\com\\bjpowernode\\io\\stream\\object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            // 2.从文件中读取对象
            Object o = ois.readObject();
            System.out.println(o instanceof Student);
            Student s = (Student) o;
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
