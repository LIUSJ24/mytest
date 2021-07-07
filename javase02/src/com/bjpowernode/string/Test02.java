package com.bjpowernode.string;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * String��ĳ��÷���
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        // 1.charAt(int index):��ȡָ��λ��/�±�/�������ĵ����ַ�
        String str1 = "abcdefg";
        System.out.println(str1.charAt(2));
        // �±�����ǳ���-1�������˾ͻ��׳�����Խ���쳣StringIndexOutOfBoundsException
        // System.out.println(str1.charAt(10));
        // 2.int compareTo(String anotherString)���Ƚ������ַ����Ĵ�С���Ƚϵ�ʱ���ǰ�����ĸ���е��ֵ�˳��Ƚϣ����
        // ǰ��ıȺ����С������-1�����ǰ��ıȺ���Ĵ󣬷���1�����������ȣ�����0
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
        // 3.compareToIgnoreCase(String str):���Դ�Сд�Ƚ��ַ�����С
        System.out.println("A".compareToIgnoreCase("b"));
        System.out.println("A".compareTo("b"));
        System.out.println("ABC".compareToIgnoreCase("abc"));
        System.out.println("ABC".compareTo("abc"));
        // 4.concat(String str):��һ���ַ�����ĩβȥƴ��һ���µ��ַ���,�����������ı�ԭ�����ַ������᷵��һ���µ��ַ���
        String str2 = "abc";
        String concat = str2.concat("XYZ");
        System.out.println(str2);
        System.out.println(concat);
        // 5.contains(CharSequence s):�ж�һ���ַ������Ƿ������ָ�����ַ������������������true�����򷵻�false
        String str3 = "abcdef";
        boolean cd = str3.contains("ctd");
        System.out.println(cd);
        // 6.contentEquals(CharSequence cs)
        System.out.println("abc".contentEquals("abc"));
        // 7.copyValueOf(char[] data)
        char[] data = {'a','b','c'};
        String str4 = String.copyValueOf(data);
        System.out.println(str4);
        // 8.endsWith(String suffix):�ж�һ���ַ����Ƿ���ָ�����ַ�����β
        String str5 = "���ñȽ�.txt";
        System.out.println(str5.endsWith(".doc"));
        // 9.equals(Object anObject)
        System.out.println("abc".equals("abc"));
        // 10.equalsIgnoreCase(String anotherString):���Դ�Сд�Ƚ��ַ����Ƿ����
        System.out.println("ABC".equalsIgnoreCase("abc"));
        // 11.format(String format, Object... args):
        String format = String.format("abc%sxyz", 10);
        System.out.println(format);
        // �����γ�ֵ10Ԫ����ǰ���20Ԫ��
        String str6 = "�����γ�ֵ%sԪ����ǰ���%sԪ";
        String format1 = String.format(str6, 15, 30);
        System.out.println(format1);
        // 12.getBytes():������ַ���ת��Ϊ�ֽ�����
        String str7 = "�����������ģ�";
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
        // ��ͷ����β
        str8.getChars(2,4,dst,0);
        System.out.println(Arrays.toString(dst));
        // 16.indexOf(String str):����һ���ַ��������ظ��ַ����ַ����е�һ�γ��ֵ��±�
        String str9 = "abcdbbbcd";
        System.out.println(str9.indexOf("cd"));
        // 17.lastIndexOf(String str) :����һ���ַ�����ָ���ַ��������һ�γ��ֵ��±�
        System.out.println(str9.lastIndexOf("cd"));
        // 18.isEmpty():�ж��ַ����Ƿ�Ϊ�գ��ַ���Ϊ��ָ���ǡ���������null
        String str10 = "";
        System.out.println(str10.isEmpty());
        String str11 = null;
       // System.out.println(str11.isEmpty());      ���׳�java.lang.NullPointerException
        // 19.join(CharSequence delimiter, CharSequence... elements)
        String join = String.join("abc", "xxx", "yyy","zzz");
        System.out.println(join);
        // 20.length():��ȡ�ַ����ĳ���
        String str12 = "abcd";
        System.out.println(str12.length());
        // 21.matches(String regex):�ж�һ���ַ����Ƿ��ָ����������ʽƥ��
        // "A"���жϸ��ַ����Ƿ�ȫ���Ǵ�д��ĸ[A-Z]
        boolean matches = "a".matches("[A-Z]");
        System.out.println(matches);
        // 22.replace(char oldChar, char newChar):��һ���ַ�����ָ�����ַ��滻Ϊ�µ��ַ����÷��������ԭ�����ַ������иı�
        String str13 = "abc000xyz";
        // ��str13�е�0�滻Ϊ*
        String replace = str13.replace("0", "*");
        System.out.println(str13);
        System.out.println(replace);
        String replace1 = str13.replace("ab", "df");
        System.out.println(replace1);
        // 23.replaceAll(String regex, String replacement)
        // abcDefgHighXyz:�����ַ����еĴ�д��ĸ�滻Ϊ*
        String s14 = "abcDefgHighXyz";
        String s = s14.replaceAll("[A-Z]", "*");
        System.out.println(s);
        String s1 = s14.replaceAll("[a-z]", "&");
        System.out.println(s1);
        // 24.replaceFirst(String regex, String replacement)
        // ��s14�ַ����еĵ�һ����д��ĸ����Ϊ?
        String s2 = s14.replaceFirst("[E-M]", "?");
        System.out.println(s2);
        // 25.split(String regex):���/�и��ַ���
        String s15 = "zhangsan,lisi,wangwu";
        String[] split = s15.split(",");
        System.out.println(Arrays.toString(split));
        String[] split1 = s14.split("[A-Z]");
        System.out.println(Arrays.toString(split1));
        // 26.startsWith(String prefix):�ж�һ���ַ����Ƿ���ָ�����ַ�����ʼ
        boolean zh = s15.startsWith("zh");
        System.out.println(zh);
        // 27.substring(int beginIndex):��һ���ַ����н�ȡһ����
        String s16 = "�����������ģ�";
        String substring = s16.substring(3);
        System.out.println(substring);
        // 28.substring(int beginIndex, int endIndex):��ָ����λ�ô���ȡ�ַ���
        // ��ͷ����β
        String substring1 = s16.substring(3, 6);
        System.out.println(substring1);
        // 29.toCharArray():��һ���ַ���ת��Ϊ�ַ�����
        char[] chars = s16.toCharArray();
        System.out.println(Arrays.toString(chars));
        // 30.toLowerCase():����д��ĸת��ΪСд��ĸ
        String s17 = "aBcDeFgHiJkLmN";
        String s3 = s17.toLowerCase();
        System.out.println(s3);
        // 31.toUpperCase():��Сд��ĸת��Ϊ��д��ĸ
        String s4 = s17.toUpperCase();
        System.out.println(s4);
        // 32.trim():ȥ���ַ�����β�Ŀո��޷�ȥ���ַ����м�Ŀո�
        String username = "  zhan    gsan  ";
        String trim = username.trim();
        System.out.println(trim);
        int a = 10;
        String s5 = a + "";
        // 33.valueOf()�����������͵�����ת��Ϊ�ַ���
        String s6 = String.valueOf(a);      // ��������ת��Ϊ�ַ������Ƽ�ʹ������
        String s7 = String.valueOf(false);
    }
}
