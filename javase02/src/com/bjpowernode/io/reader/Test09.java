package com.bjpowernode.io.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * AutoCloseable：自动关闭，JDK1.7之后新加的。
 * 语法：
 * 1.在try的后面加一个小括号，把流的声明的代码放在小括号中，这样的话就不需要手动的写关闭的代码，
 * 流在用完之后，try会自动关闭。
 * 2.如果有多个流，这多个流都可以放在小括号中，多个直接以分号隔开，最后一个分号可以不要。
 * 3.try后面的小括号中，只能放实现了AutoCloseable的变量
 */
public class Test09 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("D:/a/a.txt");
            BufferedReader br = new BufferedReader(fr)) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
