package com.ravi.number_theory;

/**
 * Created by ravi on 10/23/2017.
 */
public class LCMofArray {

    public static void main(String[] args){

        int[] a ={1, 2, 8, 3};
        int[] b ={2, 7, 3, 9, 4};

        System.out.println("LCM{1, 2, 8, 3}: "+lcmOfArray(a));
        System.out.println("LCM{2, 7, 3, 9, 4}: "+lcmOfArray(b));

    }

    public static int lcmOfArray(int[] a){

        int ans = a[0];
        for (int i=1 ; i <a.length;i++){
            ans = (a[i]*ans)/(GCD.GCD(ans,a[i])) ;
        }
        return ans;
    }
}
