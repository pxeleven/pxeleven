package com.pxeleven.bean;

/**
 * @author pxeleven
 * @create 2020-01-31- 16:15
 */
public class Customer extends Person {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        a+=b+3;
        System.out.println("a="+a+"\nb="+b);


    }
    public void eat(){
        System.out.println("客户吃饭");
    }
}
