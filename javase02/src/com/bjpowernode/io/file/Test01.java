package com.bjpowernode.io.file;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

/**
 * File类
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // 1.File(String pathname)
            File file = new File("D:\\a\\IO流课堂笔记.md");
            File file1 = new File("D:/b");
            // 2.createNewFile():创建新文件
            File file2 = new File("D:/a/x.txt");
//            file2.createNewFile();
//            file1.createNewFile();
            // 3.delete():删除文件或文件夹
            // file2.delete();
            // 4.exists():判断file表示的路径或文件是否存在
            System.out.println(file.exists());
            System.out.println(file1.exists());
            // 5.getAbsoluteFile():获取一个file以绝对路径的形式
            File file3 = new File("src\\com\\bjpowernode\\io\\file\\file.txt");
            if (!file3.exists()) {
                file3.createNewFile();
            }
            File absoluteFile = file3.getAbsoluteFile();
            // 6.getAbsolutePath():返回一个文件的绝对路径字符串
            String absolutePath = file3.getAbsolutePath();
            System.out.println(absolutePath);
            // 7.getName():获取文件的名称
            System.out.println(file.getName());
            // 8.getParent():获取父路径
            System.out.println(file.getParent());
            // 9.getParentFile():
            File parentFile = file.getParentFile();
            // 10.getPath():获取这个文件对应的完整路径
            System.out.println(file.getPath());
            // 11.isAbsolute():判断当前的file对象是否是一个绝对路径
            System.out.println(file.isAbsolute());
            System.out.println(file3.isAbsolute());
            // 12.isDirectory():判断当前的file对象是否是一个目录（文件夹）
            System.out.println(file.isDirectory());
            File file4 = new File("D:/a");
            System.out.println(file4.isDirectory());
            // 13.isFile():判断当前的file对象是否是一个文件
            System.out.println(file.isFile());
            System.out.println(file4.isFile());
            // 14.isHidden():判断当前的文件是否是一个隐藏文件
            System.out.println(file.isHidden());
            // 15.lastModified():返回当前的file对象的最后一次的修改时间
            long l = file.lastModified();
            Date date = new Date(l);
            System.out.println(date);
            // 16.length():获取当前的file对的长度，指的是文件中字节的数量
            System.out.println(file.length());
            // 17.list():获取一个文件夹下的所有的文件，放入到一个数组中
            File file5 = new File("D:/a");
            String[] list = file5.list();
            System.out.println(Arrays.toString(list));
            // 18.listFiles():获取一个文件夹写的所有的文件对象
            File[] files = file5.listFiles();
            // 19.mkdir():创建文件夹，只能创建一个文件夹
            File file6 = new File("D:/a/b/c/d/e");
           // file6.mkdir();
            // 20.mkdirs():创建文件夹，创建多级目录
            // file6.mkdirs();
            // 21.renameTo(File dest): 重命名文件
            File dest = new File("D:/a/IO流课堂笔记1.md");
            file.renameTo(dest);
            // 22.setReadOnly():将一个文件设置为只读模式
            file.setReadOnly();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
