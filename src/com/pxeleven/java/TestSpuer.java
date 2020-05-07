package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-05-07- 15:04
 */
public class TestSpuer {
    public static void main(String[] args) {
        System.out.println("run....");
        new TestSuper02();
    }
}
class TestSuper01{
    public  TestSuper01(){
        System.out.println("run1....");

    }
}
class TestSuper02 extends TestSuper01{
    public  TestSuper02(){
        System.out.println("run2.....");

    }
}
