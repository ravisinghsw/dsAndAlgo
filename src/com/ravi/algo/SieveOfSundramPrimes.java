package com.ravi.algo;

/**
 * Created by ravi on 10/29/2017.
 */
public class SieveOfSundramPrimes {

    public static void main(String[] args){
        int n = 20;

        char[] prime = new char[n];
        int l =2 ;
        while (l <n ){
            int p = l ;
            while (p<n){
                prime[p]='N';
                p=p+l;
            }

        }



        System.out.println("Print Prime ");
        for (int i =2 ; i <n;i++){
            if (!(prime[i]=='N')){
                System.out.print(i +" ");
            }
        }
    }


}
