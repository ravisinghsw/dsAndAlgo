package com.ravi.geekforgeeks.array.array;

public class MaxSumInContinuesArray {

    public static void main(String[] args) {
        int [] arr = {-8,1,2,-15,-15,7,-4,34};
        int max = 0;
        for(int i=0 ; i < arr.length ; i++) {
            for (int j=0 ; j <arr.length ; j++) {
                int sum = sum(arr , i , j);
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("Max Continues sum of array :: "+max);
    }

    private static int sum(int[] arr , int startIndex , int endIndex) {
        int sum = 0 ;
        for (int j=startIndex; j<=endIndex ; j++) {
            sum = sum + arr[j];
        }
        return sum;
    }
}
