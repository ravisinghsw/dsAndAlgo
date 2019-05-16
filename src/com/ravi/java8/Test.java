package com.ravi.java8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ravi on 11/5/2017.
 */
public class Test {

    public static void main(String[] args) {
        int a = 8;
        System.out.println(a >> 16);
        System.out.println(a >>> 2);
      /* if(3*0.1==0.3){
           System.out.println("kjh");
       }*/
       Map<String,String> map= new HashMap<>();
       map = new ConcurrentHashMap<>() ;

    }
   /*  private static void printNum(Integer a){
         System.out.println("Integer "+a);
     }*/

    /*private static void printNum(int a){
         System.out.println("prim int "+a);
     }*/

    private static void printNum(Long a){
        System.out.println("Long "+a);
    }

    /*private static void printNum(long a){
        System.out.println("prim long "+a);
    }*/

   /* private static void printNum(Object a){
        System.out.println("Object "+a);
    }*/
    private static void printNum(String a){
        System.out.println("String "+a);
    }
}
