package com.bjpowernode.homework;

/**
 * 6、判断用户输入的验证码xY4t是否正确（系统生成的验证码为xy4T），验证码不区分大小写。
 */
public class Test07 {
    public static void main(String[] args) {
        String def = "xy4T";
        String input = "xY4t";
        System.out.println(def.equalsIgnoreCase(input));

        String defLower = def.toLowerCase();
        String inputLower = input.toLowerCase();
        System.out.println(defLower.equals(inputLower));

    }
}
