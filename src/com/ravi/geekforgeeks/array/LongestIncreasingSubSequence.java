package com.ravi.geekforgeeks.array;

/**
 * Created by ravi on 11/8/2017.
 */
public class LongestIncreasingSubSequence {

    public static void main(String[] args) {
        int[] arr = {3,10,2,1,20,50};

        int maxIncreaseCount = maxIncreaseCount(arr, 0 , arr.length);
        System.out.println(maxIncreaseCount);
    }

    private static int maxIncreaseCount(int[] arr, int l, int r) {
        int scurr = 1 ;
        for (int i = l+1 ; i < r ; i++) {
            if(arr[i] > arr[i-1]){
                scurr =   scurr + 1;
            }else {
                int nextScurr = maxIncreaseCount(arr,i,r);
                scurr = scurr>nextScurr ? scurr :nextScurr ;
            }

        }

        return scurr;
    }
}
