package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-25- 0:03
 */
    public class TestQ02 {
        public static void main(String[] args) {
            int b=0;
            for(int i=1;i<=10000;i++) {
                 if (i % 5 == 0) {
                        System.out.print(i+"\t");
                        b++;
                 }
                if (b%5==0) {
                    System.out.println();

                }
            }

        }

  }