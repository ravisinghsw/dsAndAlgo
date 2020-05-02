package com.ravi.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlatMapMaxOccurance {

    public static void main(String[] args) {

        int result = new FlatMapMaxOccurance().solution(3, new int[]{1, 2, 3, 3, 1, 3, 1});

    }

    public int solution(int M, int[] A) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(A).forEach(a -> {
            if (map.get(a) != null) {
                int value = map.get(a);
                map.put(a, value+1);
            } else {
                map.put(a, 1);
            }
        });

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey() + " - "+integerIntegerEntry.getValue());
        }


        return result;
    }
}
