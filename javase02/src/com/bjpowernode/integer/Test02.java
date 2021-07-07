package com.bjpowernode.integer;

/**
 * 包装类的构造方法
 * Integer(int value)
 * Integer(String value)
 */
public class Test02 {
    public static void main(String[] args) {
        // i1底层其实就是一个数字10，只不过它不是基本类型了，它是引用类型
        // 将基本类型转换为引用类型（装箱）
        Integer i1 = new Integer(10);
        // 传入的字符串必须是一个整数
        Integer i2 = new Integer("10");

        byte b = 65;
        Byte b1 = new Byte(b);

        Double d = new Double(9.34);
        Character c = new Character('c');
        Boolean bn = new Boolean(true);

        // 将i1转换为int(拆箱)
        int i = i1.intValue();

    }
}
