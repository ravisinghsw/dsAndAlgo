package com.ravi.ocjp;

/**
 * Created by ravi on 10/29/2017.
 */
public class SubSubAlpha extends Alpha{
    //String a = "asd";
    private SubSubAlpha(){
        System.out.println(a);
        a+="subsub";
        System.out.println(a);
    }

    public static void main(String [] args){
        new SubSubAlpha();
       // System.out.println(a);
    }
}
