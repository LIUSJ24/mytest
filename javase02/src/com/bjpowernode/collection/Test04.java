package com.bjpowernode.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("hig");
        c.add("nkm");
        c.add("xyz");
        for(Object obj : c){
            // 想要调用字符串String类中的方法
            String str = (String) obj;
        }
    }
}
