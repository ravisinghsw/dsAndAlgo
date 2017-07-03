package com.ravi.geekforgeeks;

/**
 * Created by ravi on 7/3/2017.
 */

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;

/**
 * Example:
 Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16
 Sort the array
 A = {-8, 1, 4, 6, 10, 45}

 Initialize l = 0, r = 5

 A[l] + A[r] ( -8 + 45) > 16 => decrement r. Now r = 10
 A[l] + A[r] ( -8 + 10) < 2 => increment l. Now l = 1
 A[l] + A[r] ( 1 + 10) < 16 => increment l. Now l = 2
 A[l] + A[r] ( 4 + 10) < 14 => increment l. Now l = 3
 A[l] + A[r] ( 6 + 10) == 16 => Found candidates (return 1)

 Note: If there are more than one pair having the given sum then this algorithm reports only one. Can be easily extended for this though.
 http://www.fluentland.com/how-to-give-opinion-in-english/
 */
public class CheckInArraySumOfPairAsX {

    public static void main(String[] args) throws Exception{

        int [] arr={1, 4, 45, 6, 10, -8};

        int value = 16;

        for (int  x : arr) {
            System.out.print(x + " ");
        }

        sort(arr);
        System.out.println("\n Sorted array");
        for (int  x : arr) {
            System.out.print(x + " ");
        }
    }


    public static void sort(int[] arr){

        for(int i = 1 ; i < arr.length ; i++){
            int k = i-1;
            while (k>=0){
                if(arr[k]> arr[i]) {
                    int temp = arr[i];
                     arr[i] =  arr[k];
                    arr[k] = temp;
                    i--;

                }


                k--;
            }


        }
    }
}
