package com.bjpowernode.annotation;

/**
 * 这是一个注解容器，这里需要定义一个属性，这个属性是容器中注解类型数组
 */
public @interface MyRepeatables {
    MyRepeatable[] value();
}
