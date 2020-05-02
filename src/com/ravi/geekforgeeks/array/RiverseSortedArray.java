package com.ravi.geekforgeeks.array;

import java.util.Arrays;

public class RiverseSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseSortedArray()));
    }

     public static int[ ] reverseSortedArray () {
         int [] arr = new int[100000];
         int val = 100000;
         for (int i = 0 ; i < 100000; i++){
             arr[i] = val;
             val--;
         }
         return arr;
     }


}
