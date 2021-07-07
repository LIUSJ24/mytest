package com.bjpowernode.nio.buffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * 缓冲区的核心方法
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.分配非直接缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(16);
        // 2.put()：向缓冲区中添加数据
        buffer.put((byte) 97);
        buffer.put("xyz".getBytes());
        buffer.put(1,(byte) 101);
        buffer.put("hkkhuuol".getBytes(),2,4);
        System.out.println(buffer.position());
        // 3.flip()：翻转缓冲区
        buffer.flip();
        // 4.get():从缓冲区中获取数据,无参的方法默认从当前位置上读取
        byte b = buffer.get();
        System.out.println(b);
        byte b1 = buffer.get(5);
        System.out.println(b1);
        byte[] bytes = new byte[3];
        buffer.get(bytes);
        System.out.println(Arrays.toString(bytes));
        // 5.rewind():
        buffer.rewind();
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        // 6.clear():清空缓冲区，但是不会删除缓冲区的数据
        buffer.clear();
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        // clear方法执行后，get方法还可以获取数据
        byte b2 = buffer.get();
        System.out.println(b2);
        // 7.hasRemaining:判断缓冲区中是否还有未读的数据
        boolean b3 = buffer.hasRemaining();
        System.out.println(b3);
        // 8.remaining:获取当前缓冲区中未读的数据，返回未读的个数
        int remaining = buffer.remaining();
        System.out.println(remaining);
        // 9.compact()：将所有的未读的元素拷贝到缓冲区的起始位置
        buffer.compact();
    }
}
