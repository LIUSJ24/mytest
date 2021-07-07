package com.bjpowernode.collection;

public class Test08 {
    public static void main(String[] args) {
        Teacher<Integer> t = new Teacher();
        t.work(10);

        Teacher<String> t1 = new Teacher<>();
        t1.work("abc");

        // Teacher<int> t2 = new Teacher<int>();

    }
}

/**
 * 自定义泛型，是在类名的后面加一个尖括号，在尖括号中写上泛型名称；
 * 泛型名称没有任何限制，可以随意定义
 * 在java中，一般泛型的名称T E,T是单词Type的首字母，E是单词Element的首字母
 * 泛型不能传基本类型。
 */
class Teacher<泛型> {

    /**
     * work方法须有一个参数，但是这个参数的类型不固定
     * 这个方法就可以定义一个泛型
     */
    public void work(泛型 e){

    }
}