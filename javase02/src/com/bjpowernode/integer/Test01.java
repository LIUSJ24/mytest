package com.bjpowernode.integer;

/**
 * 包装类
 */
public class Test01 {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(10);
    }
}
// 这个MyInt类就是一个包装类，它底层包装了一个基本类型的数据
class MyInt {
    private int i;

    public MyInt(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}