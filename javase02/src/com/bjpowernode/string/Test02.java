package com.bjpowernode.string;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * String类的常用方法
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        // 1.charAt(int index):获取指定位置/下标/索引处的单个字符
        String str1 = "abcdefg";
        System.out.println(str1.charAt(2));
        // 下标最大是长度-1，超过了就会抛出索引越界异常StringIndexOutOfBoundsException
        // System.out.println(str1.charAt(10));
        // 2.int compareTo(String anotherString)：比较两个字符串的大小，比较的时候是按照字母表中的字典顺序比较，如果
        // 前面的比后面的小，返回-1，如果前面的比后面的大，返回1，如果两个相等，返回0
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
        // 3.compareToIgnoreCase(String str):忽略大小写比较字符串大小
        System.out.println("A".compareToIgnoreCase("b"));
        System.out.println("A".compareTo("b"));
        System.out.println("ABC".compareToIgnoreCase("abc"));
        System.out.println("ABC".compareTo("abc"));
        // 4.concat(String str):在一个字符串的末尾去拼接一个新的字符串,这个方法不会改变原来的字符串，会返回一个新的字符串
        String str2 = "abc";
        String concat = str2.concat("XYZ");
        System.out.println(str2);
        System.out.println(concat);
        // 5.contains(CharSequence s):判断一个字符串中是否包括了指定的字符串，如果包含，返回true，否则返回false
        String str3 = "abcdef";
        boolean cd = str3.contains("ctd");
        System.out.println(cd);
        // 6.contentEquals(CharSequence cs)
        System.out.println("abc".contentEquals("abc"));
        // 7.copyValueOf(char[] data)
        char[] data = {'a','b','c'};
        String str4 = String.copyValueOf(data);
        System.out.println(str4);
        // 8.endsWith(String suffix):判断一个字符串是否以指定的字符串结尾
        String str5 = "课堂比较.txt";
        System.out.println(str5.endsWith(".doc"));
        // 9.equals(Object anObject)
        System.out.println("abc".equals("abc"));
        // 10.equalsIgnoreCase(String anotherString):忽略大小写比较字符串是否相等
        System.out.println("ABC".equalsIgnoreCase("abc"));
        // 11.format(String format, Object... args):
        String format = String.format("abc%sxyz", 10);
        System.out.println(format);
        // 您本次充值10元，当前余额20元。
        String str6 = "您本次充值%s元，当前余额%s元";
        String format1 = String.format(str6, 15, 30);
        System.out.println(format1);
        // 12.getBytes():将与给字符串转换为字节数组
        String str7 = "今天是星期四！";
        byte[] bytes = str7.getBytes();
        System.out.println(Arrays.toString(bytes));
        // 13.getBytes(Charset charset)
        byte[] gbks = str7.getBytes(Charset.forName("GBK"));
        System.out.println(Arrays.toString(gbks));
        // 14.getBytes(String charsetName)
        byte[] bytes1 = str7.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(bytes1));
        // 15.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] dst = new char[5];
        String str8 = "abcdefg";
        // 含头不含尾
        str8.getChars(2,4,dst,0);
        System.out.println(Arrays.toString(dst));
        // 16.indexOf(String str):传入一个字符串，返回该字符在字符串中第一次出现的下标
        String str9 = "abcdbbbcd";
        System.out.println(str9.indexOf("cd"));
        // 17.lastIndexOf(String str) :返回一个字符串在指定字符串中最后一次出现的下标
        System.out.println(str9.lastIndexOf("cd"));
        // 18.isEmpty():判断字符串是否为空，字符串为空指的是“”，不是null
        String str10 = "";
        System.out.println(str10.isEmpty());
        String str11 = null;
       // System.out.println(str11.isEmpty());      会抛出java.lang.NullPointerException
        // 19.join(CharSequence delimiter, CharSequence... elements)
        String join = String.join("abc", "xxx", "yyy","zzz");
        System.out.println(join);
        // 20.length():获取字符串的长度
        String str12 = "abcd";
        System.out.println(str12.length());
        // 21.matches(String regex):判断一个字符串是否和指定的正则表达式匹配
        // "A"，判断该字符串是否全部是大写字母[A-Z]
        boolean matches = "a".matches("[A-Z]");
        System.out.println(matches);
        // 22.replace(char oldChar, char newChar):将一个字符串中指定的字符替换为新的字符，该方法不会对原来的字符串进行改变
        String str13 = "abc000xyz";
        // 将str13中的0替换为*
        String replace = str13.replace("0", "*");
        System.out.println(str13);
        System.out.println(replace);
        String replace1 = str13.replace("ab", "df");
        System.out.println(replace1);
        // 23.replaceAll(String regex, String replacement)
        // abcDefgHighXyz:将该字符串中的大写字母替换为*
        String s14 = "abcDefgHighXyz";
        String s = s14.replaceAll("[A-Z]", "*");
        System.out.println(s);
        String s1 = s14.replaceAll("[a-z]", "&");
        System.out.println(s1);
        // 24.replaceFirst(String regex, String replacement)
        // 将s14字符串中的第一个大写字母代替为?
        String s2 = s14.replaceFirst("[E-M]", "?");
        System.out.println(s2);
        // 25.split(String regex):拆分/切割字符串
        String s15 = "zhangsan,lisi,wangwu";
        String[] split = s15.split(",");
        System.out.println(Arrays.toString(split));
        String[] split1 = s14.split("[A-Z]");
        System.out.println(Arrays.toString(split1));
        // 26.startsWith(String prefix):判断一个字符串是否以指定的字符串开始
        boolean zh = s15.startsWith("zh");
        System.out.println(zh);
        // 27.substring(int beginIndex):从一个字符串中截取一部分
        String s16 = "今天是期星四！";
        String substring = s16.substring(3);
        System.out.println(substring);
        // 28.substring(int beginIndex, int endIndex):从指定的位置处截取字符串
        // 含头不含尾
        String substring1 = s16.substring(3, 6);
        System.out.println(substring1);
        // 29.toCharArray():将一个字符串转换为字符数组
        char[] chars = s16.toCharArray();
        System.out.println(Arrays.toString(chars));
        // 30.toLowerCase():将大写字母转换为小写字母
        String s17 = "aBcDeFgHiJkLmN";
        String s3 = s17.toLowerCase();
        System.out.println(s3);
        // 31.toUpperCase():将小写字母转换为大写字母
        String s4 = s17.toUpperCase();
        System.out.println(s4);
        // 32.trim():去除字符串首尾的空格，无法去除字符串中间的空格
        String username = "  zhan    gsan  ";
        String trim = username.trim();
        System.out.println(trim);
        int a = 10;
        String s5 = a + "";
        // 33.valueOf()：将其他类型的数据转换为字符串
        String s6 = String.valueOf(a);      // 基本类型转换为字符串，推荐使用这种
        String s7 = String.valueOf(false);
    }
}
