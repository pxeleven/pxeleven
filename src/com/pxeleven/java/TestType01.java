package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-24- 13:16
 */
public class TestType01 {
    public static void main(String[] args) {
        int money=1000000000;
        int years=20;
        int a=money*years;
        long b=money*years;
        double c=money*years;
        long d =money* (long)years;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
