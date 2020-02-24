package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-24- 23:45
 */
public class TestQ01 {
    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        for(int i=1 ;i<=100;i++){
           if ((i%2)==1) {
               sum+=i;

           }else{
               sum1+=i;
           }
        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}
