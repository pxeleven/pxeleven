package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-25- 17:35
 */
public class TestQ04 {
    public static void main(String[] args) {
      outer : for (int i = 101; i <= 150; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if (i%j==0){
                    continue outer;
                }

            }
          System.out.println("i = " + i);
      }
    }
}
