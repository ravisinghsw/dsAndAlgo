package com.ravi.geekforgeeks.array;

import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2, n = 7;

       /* int roatation = 2 % 7;
        while (d > 0) {
            rotateAnArrayOnce(arr);
            d--;
        }*/
        rotateUsingTempArray(arr,d);

        System.out.println(Arrays.toString(arr));


    }


    private static void rotateUsingTempArray(int[] arr, int d) {
        int rotation = d % arr.length;
        int temp[] = new int[rotation];
        for(int i = 0 ; i < rotation ; i++){
            temp[i] = arr[i];
        }
        //shift all element
        for (int j = rotation ; j < arr.length ; j++) {
            arr[j-rotation]  = arr[j];
        }
        for(int i = 0 ; i < temp.length ; i++){
            arr[arr.length - rotation + i] = temp[i];
        }
    }

    private static void rotateAnArrayOnce(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = a;
    }
}
