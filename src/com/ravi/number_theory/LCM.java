package com.ravi.number_theory;

/**
 * Created by ravi on 10/23/2017.
 */
public class LCM {

    public static void main(String[] args){

        System.out.println("LCM(54,24): "+LCM(54,24));

    }

    public static int LCM (int a , int b) {
        int gcd = GCD.GCD(a,b);

        return (a*b)/gcd ;
    }

}
