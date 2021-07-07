package com.bjpowernode.exception;

import java.text.ParseException;

/**
 * 如果一个子类继承了父类，重写了父类的方法
 * 1.如果父类的方法抛出了异常，子类重写父类的方法后，子类的方法可以不抛出异常
 * 2.子类重写父类的方法，可以抛出一个和父类一样的异常
 * 3.子类重写父类的方法，抛出的异常范围不能比父类的广
 * 4.子类重写父类的方法，抛出的异常必须是父类方法的子类或者和父类的异常一致
 */
public class Test10 {
}
class Person{
    public void eat() throws ParseException {}
    public void work() {}
}
class Student extends Person {

    // 子类重写父类的方法，如果父类的方法抛出了异常
    // public void eat(){}
    // public void eat() throws ParseException{}
   // public void eat() throws Exception{}
}
