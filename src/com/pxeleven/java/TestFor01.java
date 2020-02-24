package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-24- 23:09
 */
public class TestFor01 {
    public static void main(String[] args) {
        for(int i=1;i<=19;i++){
            for(int j=1;j<=i;j++){
               // System.out.print(j+"*"+i+"="+ (i*j<100?(i*j)+"    ":(i*j>100)?(i*j)+"   ":(i*j))+"\t");
                System.out.print(j+"*"+i+"="+ (i*j<100?(i*j)+"    ":(i*j)+"   ")+"\t");
            }
            System.out.println();
        }
    }
}
