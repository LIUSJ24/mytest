package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        Map<Teacher, Integer> map = new HashMap<>();
        Teacher t1 = new Teacher("张三");
        Teacher t2 = new Teacher("张三1");
        Teacher t3 = new Teacher("张三2");
        map.put(t1,10);
        map.put(t2,10);
        map.put(t3,10);
    }

}
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
