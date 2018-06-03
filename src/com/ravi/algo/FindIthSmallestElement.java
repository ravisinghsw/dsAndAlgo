package com.ravi.algo;

public class FindIthSmallestElement {

    public static void main(String[] args) {
        int arr [] = {44,55,1,3,7,8,9,0};

        //find 2nd smallest element;
        int k = 6;
        int p = 0;
        int q = arr.length-1;
        int r = QuickSort.partition(arr,p,q);
        while(r!=k){
            if(r>k){
                r =  QuickSort.partition(arr,p,r-1);
            }
            if(r<k){
                r =  QuickSort.partition(arr,r+1,q);
            }

        }
        System.out.println("rank :"+k + " and element "+arr[r]);
    }
}
