package com.ravi.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

/**
 * Created by ravi on 9/16/2017.
 */
public class StreamTest {

    public  static void main(String[] rgs) {
        List<Integer> a = new ArrayList<>();
        a.add(87);
        a.add(6);
        a.add(1);
        a.add(4);
        a.add(3);

        a.stream().filter(x -> x>10);
        a.parallelStream();
    }
}
