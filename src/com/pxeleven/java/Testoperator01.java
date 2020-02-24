package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-20- 14:26
 */
public class Testoperator01 {
    public static void main(String[] args) {
        int c=12<<2;
        int a=3,b=4;
        int x=-80;
        //a+=b;
        System.out.println(c);
        System.out.println(a);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(x<100?1:(x==0?1:-1));
    }
}
