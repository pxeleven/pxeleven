package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-25- 18:52
 */
public class TextMethod {
    public static void main(String[] args) {
        TextMethod textMethod = new TextMethod();
        textMethod.print();
        int sum=textMethod.add(12,13,14);
        System.out.println(sum);
        String sum1=textMethod.add("this","is","pwj");
        System.out.println(sum1);
    }
    public static void print(){
        System.out.println("彭文君");
        System.out.println("彭文芬");
        System.out.println("彭奕萱");
    }
    public static int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public String add (String a, String b, String c){
        String sum= a+" "+b+" "+c;
        return sum;
    }
}
