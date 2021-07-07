package com.bjpowernode.string;

/**
 * StringBuffer的构造方法
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        // StringBuffer():这行代码执行完，等价于char[] chars = new char[16];
        StringBuffer buf = new StringBuffer();
        // StringBuffer(CharSequence seq) :这行代码执行完，等价于char[] chars = new char[3+16];
        StringBuffer buf1 = new StringBuffer("abc");
        // StringBuffer(int capacity)
        // 在构建StringBuffer对象的时候，尽量给一个合理的稍微大的容量，这样可以减少底层数组的
        // 扩容，提供效率
        StringBuffer buf2 = new StringBuffer(1024);
    }
}
