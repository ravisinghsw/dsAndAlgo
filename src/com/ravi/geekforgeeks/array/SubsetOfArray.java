package com.ravi.geekforgeeks.array;

/**
 * Created by ravi on 11/8/2017.
 */
public class SubsetOfArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        printSubSet(arr,0 , arr.length-1);

    }

    private static void printSubSet(int[] arr, int l, int r) {

        if(l==r){
            System.out.println(" " + arr[l]);
        }else {
            printSubSet(arr,l+1,r);
            for (int i = l ; i <=r ; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
            printSubSet(arr,l,r-1);
            for (int i = l ; i <=r ; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }
}
