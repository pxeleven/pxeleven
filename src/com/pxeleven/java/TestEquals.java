package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-05-07- 13:02
 */
public class TestEquals {
    public static void main(String[] args) {
        persons per = new persons(18,"彭文君");
        persons per1 = new persons(18,"彭文芬");
        System.out.println(per==per1);
        System.out.println(per.equals(per1));
        String str = new String("彭文君");
        String str1 = new String("彭文君");
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
    }
}
