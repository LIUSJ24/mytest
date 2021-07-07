package com.bjpowernode.io.stream;

import java.io.PrintStream;

/**
 * PrintStream：打印流
 */
public class Test13 {
    public static void main(String[] args) throws Exception{
        // 这个流默认是向控制台输出
        PrintStream ps = System.out;
        // write方法是写的是字节
        ps.write(97);
        // print方法写的是数据本身
        ps.print(97);
        ps.println(97);
        // append方法只能写字符或字符串
        ps.append("我是append方法追加的内容");

        // 改变PrintStream的输出方向
        ps = new PrintStream("D:/a/c.txt");
        ps.write(97);
        ps.print(97);
        ps.println(97);
        ps.append("97");

    }
}
