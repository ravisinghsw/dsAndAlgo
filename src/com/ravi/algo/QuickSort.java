package com.ravi.algo;

public class QuickSort {

    public static void main(String[] args) {
        int arr [] = {44,55,1,3,7,8,9,0};
        System.out.println("Input ::");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("\n");

        quickSort(arr , 0 , arr.length-1);

        System.out.println("After quick sort :: ");
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void quickSort(int [] arr , int p , int q){

        if(p>=q){
            return;
        }else {
            int r = partition(arr,p,q);
            System.out.println("partition :"+r + " and element "+arr[r]);
            quickSort(arr,p,r-1);
            quickSort(arr,r+1,q);
        }

    }

    public static int partition(int[] arr , int p , int q) {
        int x = arr[p];
        int i = p;
        for(int j = i+1 ; j<=q;j++){
            if(arr[j]<x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[p];
        arr[p] = arr[i];
        arr[i] = temp;
        return i;
    }
}
