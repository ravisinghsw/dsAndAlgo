package com.ravi.algo;

import java.util.Arrays;

/**
 * Created by ravi on 9/8/2017.
 */
public class Permutation {

    public static void main(String[] args) {
        String input = "CAT";
        int startIndex = 0;
        int length = input.length()-1;
        permutate("CAT", startIndex, length);
    }

    private static void permutate(String input, int left, int right) {
        if(left==right){
            System.out.println("output"+input);
        } else {
            for (int i=left ; i <=right ;i++){
                input = swap(input ,left , i);
                System.out.println("intermediate "+input);
                permutate(input,left+1, right);
                input = swap(input ,left , i);
            }
        }
    }

     static  String swap(String str , int i , int j) {
         char temp;
         char[] charArray = str.toCharArray();
         temp = charArray[i] ;
         charArray[i] = charArray[j];
         charArray[j] = temp;
         return String.valueOf(charArray);
      }
}
