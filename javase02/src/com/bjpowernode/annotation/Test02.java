package com.bjpowernode.annotation;

/**
 * 定义了属性的注解的使用
 * 1.如果一个注解类中定义了属性，并且这个属性没有默认值，那么在使用该注解时，必须对该注解的属性赋值
 * 2.如果一个注解类中定义了多个属性，多个属性赋值都是放在小括号中，多个属性之间以逗号隔开
 * 3.如果注解类中的属性是一个数组，赋值的时候，多个属性值放在大括号中,如果数组的元素只有1个，大括号可以省略
 * 4.如果一个注解类中的属性名称是value的话，赋值的时候属性名可以省略,但是如果这个注解中不止有一个value属性的时候，不可以省略
 */
@MyAnnotation3(age = 20,name="张三",ages = {10,30})
public class Test02 {

    @MyAnnotation3(name="李四",ages = 50)
    public void m1(){

    }

    @MyAnnotation4(value = "abc",age = 30)
    public void m2(){}

    // @MyAnnotation4("abcde",age = 33)
    public void m3(){}
}
