package com.pxeleven.java;

import java.util.HashMap;

/**
 * @author pxeleven
 * @create 2020-01-31- 23:59
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("name","TOM");
        map.put("age","12");
        map.put("school","TingHua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
