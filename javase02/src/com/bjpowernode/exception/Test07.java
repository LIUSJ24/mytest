package com.bjpowernode.exception;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的第二种处理方式：使用try{}catch{}代码块进行捕获
 * 1.将发生了异常的代码放到try{}代码块中
 * 2.try代码块中的代码是一定会执行的，但是catch中的代码不一定执行
 * 只有当try中确实发生了异常，并且发生的异常和catch中的能够匹配的上，才会执行catch代码块中的代码
 * 3.catch后面的小括号中写的异常，必须和捕获的异常保持一致，或者就写捕获异常的父类
 * 4.当一个try代码块中有多个异常的话，可以写多个catch代码块，每个catch去匹配一个异常;
 * 还可以写一个catch块，在这个catch的小括号中写这多个异常的父类
 * 5.当有多个catch块同时出现，这多个catch块之间必须保持从上到下，是从子类到父类的关系。
 * 父类的异常不能出现在子类之前。
 * 6.try{}catch{}即使代码发生了异常，后续的程序还能继续执行，原因是因为catch成功的捕获了异常，异常没有被上报，
 * 所以虚拟机不知道发生了异常。
 * 7.Throwable类中的方法：
 *  printStackTrace():向控制台打印异常信息
 *  getMessage()：获取异常的信息
 *  getCause():获取异常发生的原因
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
            // 向控制台打印错误信息
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println("异常信息：" + message);
            Throwable cause = e.getCause();
            System.out.println(cause);

            // 如果实际发生的异常，和catch中捕获的异常一致，代码的就会进入这里
            System.out.println("发生了转换异常");
        } catch (UnsupportedEncodingException e){
            System.out.println("发生了编码格式不支持的异常");
        } catch (Exception e) {

        }
        System.out.println("=========");
    }
}
