package com.bjpowernode.nio.buffer;

import java.nio.ByteBuffer;

/**
 * 缓冲区的4个核心属性
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.初始化缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        // 2.向缓冲区中添加3个字节put()
        buffer.put("abc".getBytes());
        System.out.println("============");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        // 3.翻转缓冲区flip(),切换为读模式
        buffer.flip();
        System.out.println("============");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        // 4.从缓冲区中获取数据get()
        buffer.get();
        System.out.println("============");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        // 5.在当前位置打个比较mark()
        buffer.mark();
        // 6.继续执行get方法，position继续向后
        buffer.get();
        System.out.println("============");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        // 7.reset()
        buffer.reset();
        System.out.println("============");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());


    }
}
