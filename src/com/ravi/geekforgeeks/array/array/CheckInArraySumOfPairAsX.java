package com.ravi.geekforgeeks.array.array;

/**
 * Created by ravi on 7/3/2017.
 */

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

 http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */
public class CheckInArraySumOfPairAsX {

    public static void main(String[] args){
        int [] arr={1, 4, 45, 6, 10, -8};
        int value = 16;

        boolean[] b = new boolean[100000];
        for(int i=0;i<arr.length ; i++){

            int temp = value - arr[i];
            if(temp >=0 && b[temp]){
                System.out.println(" value found  " + arr[i] + " "+ temp );
                break;
            }
            b[arr[i]] = true;
        }
    }

    public static void main1(String[] args) throws Exception{

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
        System.out.print( "\n\n ");
        boolean isFound = false;
        for(int i = 1 ; i <=arr.length ; i++){

            if(value == arr[i-1] + arr[i]) {
                System.out.println(arr[i-1] +"---"+ arr[i]);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println(" Value not found ");
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
