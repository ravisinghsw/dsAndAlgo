package com.ravi.geekforgeeks.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubString {

    public static void main(String[] args) {
        String str1 = "Hello";

        String str2 = "World";
    }

    static String twoStrings(String str1, String str2) {
        String result = "NO";
        Map<String,Boolean> map = new HashMap<>();

        Arrays.stream(str1.split("")).forEach(str -> {
            map.put(str, Boolean.TRUE);
        });
        for(String str : str2.split("")) {
            if(map.get(str)!=null){
                result = "YES";
                break;
            }
        }
        System.out.println(twoStrings(str1,str2));
        return result;
    }
}
