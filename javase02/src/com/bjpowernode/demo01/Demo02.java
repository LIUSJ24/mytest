package com.bjpowernode.demo01;


import java.io.File;
import java.util.Objects;

/**
 *   把一个路径下面的所有的java文件给打印出来
 *
 *   思路：
 *     1 把路径封装成一个file文件
 *     2. 拿到这个file文件拿到下面的所有的files
 *     3. 遍历 files,判断是否是文件还是文件夹
 *            文件夹
 *                 (点击进去，遍历，判断)
 *                 拿到这个file文件拿到下面的所有的files
 *                 遍历 files,判断是否是文件还是文件夹
 *                      文件夹
 *                         ... (递归)
 *                       文件
 *
 *            文件
 *                判断file是否是java文件
 *                 打印结果
 */
public class Demo02 {

    public static void main(String[] args) {

        String srcPath = "D:\\course\\02-JavaSE\\01-code";
        getJavaFile(srcPath);


    }

    /**
     *  获取路径下面所有的java文件
     * @param srcPath
     */
    private static void getJavaFile(String srcPath) {

        // 1 把路径封装成一个file文件
        File file = new File(srcPath);
        getJavaFile(file);

    }

    /**
     * 获取file 下面所有的java文件
     * @param file
     */
    private static void getJavaFile(File file) {

        // 判断null
        if (Objects.isNull(file)){

            throw new RuntimeException("不能传入null...");

        }
        // 拿到这个file文件拿到下面的所有的files
        File[] files = file.listFiles();

        if (files != null && files.length > 0 ){
            for (int i = 0; i < files.length; i++) {

                File f = files[i];
                // 文件夹
                if (f.isDirectory()){

                    //递归
                    getJavaFile(f);

                }else{ // 文件

//                    判断file是否是java文件
                    boolean b = f.getName().endsWith(".java");
                    if (b){
                        System.out.println("filename = " + f.getName());
                    }
                }
            }
        }
    }

}
