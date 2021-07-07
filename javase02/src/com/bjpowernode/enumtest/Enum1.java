package com.bjpowernode.enumtest;

/**
 * 1.枚举的关键字是enum，放在了class的位置
 * 2.枚举类中的代码是有限制的
 * 3.枚举类中的语法
 *  不需要写public static final 数据类型
 *  枚举类中直接写常量名就可以，在枚举类中，常量名同时也是常量值
 *  每个常量值之间以逗号分割，最后一个常量以分号结束。
 * 大小写切换的快捷键：ctrl+shift+x
 */
public enum Enum1 {
    // 这是传统的常量的定义
//    public static final char MALE = '男';
//    public static final char FEMALE = '女';
    // public static final String MALE = "MALE";
    // public static final String FEMALE = "FEMALE";
    MALE,FEMALE;
}
