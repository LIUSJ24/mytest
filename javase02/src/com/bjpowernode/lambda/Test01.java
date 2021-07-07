package com.bjpowernode.lambda;

public class Test01 {
    public static void main(String[] args) {
        // 根据idea的提示信息，匿名内部类实现接口的方式还可以在进行优化，被lambda替换
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        // 使用lambda来实现Runnable接口
        Runnable runnable1 = () -> {
            System.out.println("方法体");
        };

        runnable1.run();
    }
}
