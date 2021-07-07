package com.bjpowernode.io.properties;

/**
 * 读取一个文件的时候，写一个文件路径有2种形式：绝对路径、相对路径
 * 绝对路径：将来项目迁移到服务器后，这个路径就可以找不到了
 * 相对路径：如果脱离了开发工具，这个相对路径也就找不到了
 * 动态获取一个文件的路径：这个文件必须放在类路径下
 */
public class Test04 {
    // src/com/bjpowernode/io/properties/jdbc.properties
    public static void main(String[] args) {
        String path =
                Thread.currentThread().     // 获取当前线程对象
                getContextClassLoader().    // 获取类加载器
                // getResource方法的参数是文件的类路径
                        getResource("com/bjpowernode/io/properties/jdbc.properties").getPath();
        System.out.println(path);

        String path1 = Thread.currentThread().getContextClassLoader().getResource("jdbc1.properties").getPath();
        System.out.println(path1);
    }
}
