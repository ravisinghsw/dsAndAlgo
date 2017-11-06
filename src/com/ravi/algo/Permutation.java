package com.ravi.algo;

import java.util.Arrays;

/**
 * Created by ravi on 9/8/2017.
 */
public class Permutation {

    public static void main(String[] args) {
        String input = "CAT";
        permutate("CAT", 0 , input.length()-1);
    }

    private static void permutate(String input, int l, int r) {
        if(l==r){
            System.out.println(input);
        } else {
            for (int i=l ; i <input.length() ;i++){
                input = swap(input , l , r);
                permutate(input,l+1, r);
            }
        }
    }

     static  String swap(String str , int i , int j) {
         char[] charStr = str.toCharArray();
         char temp = charStr[i];
         charStr[i]=charStr[j];
         charStr[j]=temp;

         String result = "";
         for (char ch : charStr)
             result = result + ch ;
         return  result;
      }
}
