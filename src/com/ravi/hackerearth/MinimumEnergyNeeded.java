package com.ravi.hackerearth;

/**
 * Created by ravi on 11/6/2017.
 */
public class MinimumEnergyNeeded {

    public static void main(String[] args) {
        /*int arr [] = {-5,4,-2,3,1};*/
        //{4, -10, 4, 4, 4}
        //{3, 5, 2, 6, 1} ;
        int arr [] ={-1, -5, -9} ;


        System.out.println("Minimum Energy Needed "+ findEnergy(arr));
    }

    private static int findEnergy(int[] arr){
        int min = 0 ;
        int curr = 0 ;
        for (int a : arr) {
            curr = curr +a ;
            if(curr < 0 ) {
                min = min + Math.abs(curr);
                curr = 0 ;
            }
        }
        return  min+1 ;
    }

}

