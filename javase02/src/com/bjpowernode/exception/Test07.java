package com.bjpowernode.exception;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �쳣�ĵڶ��ִ���ʽ��ʹ��try{}catch{}�������в���
 * 1.���������쳣�Ĵ���ŵ�try{}�������
 * 2.try������еĴ�����һ����ִ�еģ�����catch�еĴ��벻һ��ִ��
 * ֻ�е�try��ȷʵ�������쳣�����ҷ������쳣��catch�е��ܹ�ƥ����ϣ��Ż�ִ��catch������еĴ���
 * 3.catch�����С������д���쳣������Ͳ�����쳣����һ�£����߾�д�����쳣�ĸ���
 * 4.��һ��try��������ж���쳣�Ļ�������д���catch����飬ÿ��catchȥƥ��һ���쳣;
 * ������дһ��catch�飬�����catch��С������д�����쳣�ĸ���
 * 5.���ж��catch��ͬʱ���֣�����catch��֮����뱣�ִ��ϵ��£��Ǵ����ൽ����Ĺ�ϵ��
 * ������쳣���ܳ���������֮ǰ��
 * 6.try{}catch{}��ʹ���뷢�����쳣�������ĳ����ܼ���ִ�У�ԭ������Ϊcatch�ɹ��Ĳ������쳣���쳣û�б��ϱ���
 * �����������֪���������쳣��
 * 7.Throwable���еķ�����
 *  printStackTrace():�����̨��ӡ�쳣��Ϣ
 *  getMessage()����ȡ�쳣����Ϣ
 *  getCause():��ȡ�쳣������ԭ��
 */
public class Test07 {
    public static void main(String[] args) {
        String str = "2020-10-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = sdf.parse(str);
            System.out.println(date);

            String str1 = new String(new byte[10],0,10,"GBK");
        } catch (ParseException e){
            // �����̨��ӡ������Ϣ
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println("�쳣��Ϣ��" + message);
            Throwable cause = e.getCause();
            System.out.println(cause);

            // ���ʵ�ʷ������쳣����catch�в�����쳣һ�£�����ľͻ��������
            System.out.println("������ת���쳣");
        } catch (UnsupportedEncodingException e){
            System.out.println("�����˱����ʽ��֧�ֵ��쳣");
        } catch (Exception e) {

        }
        System.out.println("=========");
    }
}
