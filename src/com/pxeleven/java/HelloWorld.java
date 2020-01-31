package com.pxeleven.java;

import com.pxeleven.bean.Customer;

import java.util.ArrayList;

//这是当行注释
public class HelloWorld {
    //prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int NUMBER = 1;
    //psfi
    public static final int NUMNER1 =1;
    //psfs
    public static final String NATION = "china";

    public static void main(String[] args) {
        System.out.print("Helloworld!!");
        int num = 10;
        System.out.println(num);
        String[] arr = new String[]{"TOM", "HANMEIMEI", "GUOMEIMEI"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //list
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //list.for
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        }
        public void method(){
            ArrayList list =new ArrayList();
            list.add(123);
            list.add(456);
            list.add(789);
            //ifn
            if (list == null) {
                
            }
            //inn
            if (list != null) {
                
            }
            //xxx.nn  xxx.null
        }
    }

