package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-03-25- 13:03
 */
public class Testextends {
    public static void main(String[] args) {
        students2 stu =new students2();
        stu.rest();
        stu.study();
        students2 stu2 = new students2("希希",12,"计算机");
        System.out.println(stu2.name);

        Testextends ts = new Testextends();
        int sum=ts.add(11,12,13);
        System.out.println(sum);
    }
    public static int add(int a,int b,int c ){
        int sum=a+b+c;
        return sum;
    }

}

class person{
    String name;
    int id;

    public void rest(){
        System.out.println("休息一会");
    }

}


class students2 extends person{
    String major;

    public void study(){
        System.out.println("我在学习");
    }
    public students2(String name,int id,String major){
        this.name=name;
        this.id =id;
        this.major=major;
    }

    public students2(){

    }

}




