package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-24- 18:44
 */
public class TestSum {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100) {
            sum+=i;
            i++;
        }
        System.out.println("sum = " + sum);


        int a=1;
        int sum1=0;
        for (int j = 0; j < 100; j++) {
            sum1+=a;
            a++;

        }
        System.out.println("sum1 = " + sum1);

    }
}
