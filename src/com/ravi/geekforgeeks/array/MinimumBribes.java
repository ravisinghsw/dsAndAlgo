package com.ravi.geekforgeeks.array;

public class MinimumBribes {

    public static void main(String[] args) {

        int[] arr1 = {2, 1, 5, 3, 4};

        int[] arr2 = {2, 5, 1, 3, 4};
       /* minBribes(arr1);
        minBribes(arr2);*/

        int [] temp= {1,2 ,5 ,3 ,7 ,8 ,6 ,4};
        minBribes(temp);



    }

    // Complete the minimumBribes function below.
    private static void minBribes(int[] arr) {
        boolean tooChaotic = false;
        int minBribe = 0;
        for (int i=0 ; i < arr.length ; i++) {
            int tempVal = arr[i];
            int position = tempVal - 1 - i;
            if(position >=3){
                tooChaotic = true;
                break;
            }
            for (int j = i ; j >=0 ; j--){
                if(arr[j]>tempVal){
                    minBribe ++;
                }
            }
        }

        if(tooChaotic){
            System.out.println("Too chaotic");
        } else  {
            System.out.println(minBribe);
        }

    }

}
