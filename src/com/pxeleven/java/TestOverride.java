package com.pxeleven.java;

/**
 * @author pxeleven
 * @create 2020-05-07- 10:30
 */
public class TestOverride {
    public static void main(String[] args) {
        System.out.println("start......");
         Host host1 =new Host();
         host1.run();
         host1.stop();
    }
}
class Vehicle{
    public void run(){
        System.out.println("run....");
    }
    public void stop(){
        System.out.println("stop.....");
    }
}
class Host extends Vehicle{
    public  void run(){
        super.run();
        System.out.println("host....run...");
    }

}
