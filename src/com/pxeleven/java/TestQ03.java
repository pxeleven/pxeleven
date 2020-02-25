package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-25- 10:44
 */
public class TestQ03 {
    public static void main(String[] args) {
        int count=0;
        for(int j=1;j<=10000;j++) {
            if (j % 5 != 0) {

                continue;

            }
            System.out.print(j+"\t");
            count++;
            if (count%5==0) {
                System.out.println();
            }
        }
    }
}
