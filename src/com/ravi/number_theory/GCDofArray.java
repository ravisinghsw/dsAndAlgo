package com.ravi.number_theory;

/**
 * Created by ravi on 10/23/2017.
 */
public class GCDofArray {

    public static void main(String[] args){

        int[] a ={1, 2,  3};
        int[] b ={2, 4, 6, 8};

        System.out.println("LCM{1, 2, 3}: "+gcdOfArray(a));
        System.out.println("LCM{{2, 4, 6, 8}}: "+gcdOfArray(b));

    }

    public  static int gcdOfArray(int [] a){
        int ans = a[0];
        for (int i=1 ; i<a.length;i++) {
            ans = GCD.GCD(a[i], ans);
        }
        return ans;
    }
}
