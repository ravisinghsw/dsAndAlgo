package com.ravi.number_theory;

/**
 * Created by ravi on 10/23/2017.
 */
public class GCD {

    public static void main(String[] args) {

        System.out.println("GCD (54,24) = " + GCD(54, 24));
        System.out.println("GCD (54,24) = " + GCD2(54, 24));
    }

    public static int GCD(int a, int b) {

        if (a == 0 || b == 0)
            return 0;

        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return GCD(b, r);
        }

    }

    /**
     * Eulicid Algorithm
     *
     * @param a
     * @param b
     * @return
     */
    public static int GCD2(int a, int b) {

        if (a == 0 || b == 0)
            return 0;

        if (a == b) {
            return a;
        }

        if (a > b) {
            return GCD2(a - b, b);
        }
        return GCD2(a, b - a);
    }
}
