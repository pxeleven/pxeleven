package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-02-26- 17:47
 */
public class Students {
    int id,age;
    String sname;
    Computer1 computer1;

    void study1(){
        System.out.println("我正在努力学习!!使用"+computer1.brand1);
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.id=1001;
        students.age=18;
        students.sname="PWJ";


        Computer1 computer11 =new Computer1();
        computer11.brand1="联想";
        students.computer1=computer11;

        students.study1();

    }

}


class Computer1{
    String brand1;
}