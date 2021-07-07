package com.bjpowernode.string;

/**
 * StringBuffer的方法
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append(10);
        buf.append(3.14);
        buf.append(false);
        for (int i = 0; i < 1000; i++) {
            // append方法等价于字符串中的+
            buf.append("a");
        }
        System.out.println(buf.capacity());
        System.out.println(buf);
        StringBuffer delete = buf.delete(4, 6);
        System.out.println(delete);
        // deleteCharAt(int index)
        StringBuffer newStr = delete.deleteCharAt(1);
        System.out.println(newStr);
        // ensureCapacity(int minimumCapacity)
        buf.ensureCapacity(1200);
        System.out.println(buf.capacity());
        // insert(int offset, boolean b)：可以在指定的位置上插入指定的字符
        StringBuffer insert = newStr.insert(3, "xyz");
        System.out.println(insert);
        // reverse()：反转字符串
        StringBuffer reverse = insert.reverse();
        System.out.println(reverse);
        StringBuffer buf1 = new StringBuffer("abc");
        System.out.println(buf1.reverse());
        // setCharAt(int index, char ch):设置某一个位置上的字符
        buf1.setCharAt(2,'*');
        System.out.println(buf1);
        insert.setLength(10);
        System.out.println(insert);
    }
}
