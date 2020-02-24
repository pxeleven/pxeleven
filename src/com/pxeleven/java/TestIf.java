package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-24- 14:37
 */
public class TestIf {
    public static void main(String[] args) {
        double a = Math.random();
        System.out.println("a = " + a);


        int i = (int)(6* Math.random())+1;
        int j = (int)(6* Math.random())+1;
        int k = (int)(6* Math.random())+1;

        int m = i+j+k;
        System.out.println("m = " + m);
        if (m<15 && m>=8){
            System.out.println("运气好");
        }else if (m>15){
            System.out.println("运气非常好");
        }else {
            System.out.println("非常差");
        }
    }
}
