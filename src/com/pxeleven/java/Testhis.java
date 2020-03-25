package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-03-23- 13:25
 */
public class Testhis {
    int a,b,c;

    Testhis(int a,int b){
        this.a=a;
        this.b=b;
    }

    Testhis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }

    void sing(){
        System.out.println("小明");
    }

    void eat(){
        this.sing();
        System.out.println("妈妈喊你回家吃饭啦"+a+b+c);
    }

    public static void main(String[] args) {
        Testhis testhis = new Testhis(2,3,4);
        testhis.eat();
    }


}
