package com.bjpowernode.enumtest;

public class Test01 {
    public static void main(String[] args) {
        Enum1 female = Enum1.FEMALE;
        System.out.println(female.toString());
//        Enum1 enum1 = Enum1.男;
//        System.out.println(enum1.toString());

        String ch = Sex.MALE.getCh();
        System.out.println(ch);
        System.out.println(Sex.MALE.getEn());

    }
}
