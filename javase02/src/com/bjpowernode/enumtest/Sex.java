package com.bjpowernode.enumtest;

/**
 * 枚举性别，要求把中文的性别和英文的性别一一对应
 * 同一个常量有多种不同的表现形式的时候，可以把多种形式关联起来
 */
public enum Sex {

    MALE("MALE","男"),
    FEMALE("FEMALE","女");

    // 因为性别有2种表现形式，所以在枚举类种，需要定义2个属性，分别用来对应它的两种表现形式
    private String en;
    private String ch;

    // 定义构造方法，用来构造常量，枚举类中的构造方法不能添加public
    Sex(String en, String ch) {
        this.en = en;
        this.ch = ch;
    }

    public String getEn() {
        return en;
    }

    public String getCh() {
        return ch;
    }
}
