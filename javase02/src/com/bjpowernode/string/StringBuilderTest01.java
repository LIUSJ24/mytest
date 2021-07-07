package com.bjpowernode.string;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // 默认初始化容量是16，所以添加16个字符后，底层数组就满了，需要扩容
        builder.append("aaaaaaaaaaaaaaaa");
        builder.append("bbb");
    }
}
