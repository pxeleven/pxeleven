package com.pxeleven.java;


/**
 * @author pxeleven
 * @create 2020-02-25- 19:50
 */
public class TestRecursion {
    public static void main(String[] args) {
        long d1 =System.currentTimeMillis();
        System.out.printf("%d阶层的结果是%s%n",5,fact(5));
        long d2 =System.currentTimeMillis();
        System.out.printf("消耗的时间为%dms%n",d2-d1);

        long d3 =System.currentTimeMillis();
        System.out.printf("%d阶层的结果是%s%n",5,factloop(5));
        long d4 =System.currentTimeMillis();
        System.out.printf("消耗的时间为%dms%n",d4-d3);

    }
    static long fact(int n){
        if (n==1){
            return 1;
        }else {
            return n*fact(n-1);
        }
    }
    static long factloop(int m){
        int result=1;
        while(m>1){
            result *= m*(m-1);
            m-=2;
        }
        return result;

    }
}
