package com.pxeleven.java;

import java.util.Scanner;

/**
 * @author pxeleven
 * @create 2020-02-24- 13:44
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String cxm=scanner.nextLine();
        System.out.println("请输入你的年龄:");
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入你的爱好:");
        String favo = scanner1.nextLine();


        System.out.println("----------------");
        System.out.println(cxm);
        System.out.println(age);
        System.out.println(favo);

    }
}
