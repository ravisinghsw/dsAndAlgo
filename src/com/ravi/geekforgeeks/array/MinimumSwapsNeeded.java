package com.ravi.geekforgeeks.array;

import java.util.Arrays;

public class MinimumSwapsNeeded {

    public static void main(String[] args) {

        int[] arr = RiverseSortedArray.reverseSortedArray();
        //  int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int swaps = 0;
        for(int i= 0 ; i < arr.length-1 ; i++){
            int minIndex = minimumIndex(arr, i+1);
            if(arr[minIndex] < arr[i] ){
                swaps ++;
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(" Minimum swaps needed :: "+swaps);

    }

    private static  int minimumIndex(int[] arr , int startIndex){
        int min = arr[startIndex];
        int minIndex = startIndex;
        for(int i=startIndex ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
