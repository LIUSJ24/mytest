package com.bjpowernode.nio.buffer;

import java.nio.ByteBuffer;

/**
 * 分配缓冲区：非直接缓冲区、直接缓冲区
 */
public class Test01 {
    public static void main(String[] args) {

        // 这个方法会在虚拟机（用户地址空间）分配一个长度是1024大小的字节数组
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 这个方法会在物理内存（内核地址空间）分配一个长度是1024大小的字节数组
        // 这个缓冲区会绕过堆、栈、垃圾回收机制，所以垃圾回收机制没法监控这个缓冲区，
        // 容易操作计算机系统奔溃。
        ByteBuffer buffer1 = ByteBuffer.allocateDirect(1024);

        // 判断一个缓冲区是否是直接缓冲区
        System.out.println(buffer.isDirect());
        System.out.println(buffer1.isDirect());
    }
}
