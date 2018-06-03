package com.ravi.algo;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {4,1,3,2,16,9,10,14,8,7};

        System.out.println("Input ::");
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");

        int half = arr.length/2 - 1;

        for(int i = half ; i >=0; i--) {
            heapify(arr,i,arr.length-1);
        }
        System.out.println("After heapify :: \n");
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int length = arr.length -1 ;
        //int i = 0;
        for(int i = 0 ; i <= length; i++) {
            int temp = arr[i];
            arr[i]=arr[length];
            arr[length]= temp;

            System.out.println("After quick sort :: \n");
            for(int a : arr) {
                System.out.print(a + " ");
            }
            heapify(arr,i,length--);
            System.out.println();
        }


    }

    private static void heapify(int[] arr , int i ,int length){

        int left = 2*i;
        int right = 2*i+1;

        if(i>length || left>length ||right>length)
            return;

        if(arr[i]<arr[left]){
            int temp = arr[left];
            arr[left] = arr[i];
            arr[i]=temp;
            heapify(arr,left,length);
        }
        if(arr[i]<arr[right]){
            int temp = arr[right];
            arr[right] = arr[i];
            arr[i]=temp;
            heapify(arr,right,length);
        }

    }
}
