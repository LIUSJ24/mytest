package com.bjpowernode.exception;

/**
 * JDK1.8中异常的新特性，多个catch块可以合并为一个，在一个catch中多个异常类之间以|分割
 */
public class Test08 {
    public static void main(String[] args) {
        try{

        } catch(NullPointerException e){

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (ClassCastException e) {

        }

        // 以上的3个catch块可以进行合并
        try{

        }catch (NullPointerException|ArrayIndexOutOfBoundsException|ClassCastException e){

        }
    }
}
