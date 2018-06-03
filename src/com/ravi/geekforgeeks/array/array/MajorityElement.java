package com.ravi.geekforgeeks.array.array;

/**
 * Majority Element: A majority element in an array A[] of size n is an element that appears more
 * than n/2 times (and hence there is at most one such element).
 * <p>
 * I/P : 3 3 4 2 4 4 2 4 4
 * O/P : 4
 * <p>
 * I/P : 3 3 4 2 4 4 2 4
 * O/P : NONE
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] ip = {-3, 3, 4, 2, 4, 4, 2, 4, 4};

        int majority = ip.length / 2;

        int[] temp = new int[1000];
        for (int i : ip) {
            temp[i%ip.length]++;
            if(temp[i%ip.length]>majority){
                System.out.println(i+" value found "+temp[i]);
            }
        }

    }
}
