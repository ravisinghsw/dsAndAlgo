package com.ravi.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by ravi on 9/16/2017.
 */
public class StreamTest {

    public  static void main(String[] rgs) {

        List<Integer> a = new ArrayList<>();
        a.add(87);
        a.add(16);
        a.add(11);
        a.add(3);
        a.add(4);
        a.add(3);
        a.stream().filter(x -> x>=1).distinct().collect(toList()).forEach(i-> System.out.println(i));
        //a.parallelStream();
    }

    public String again(Integer a) {
        return  " Str :"+a;
    }

    public static Integer init(Integer a) {
        return a+a;
    }
}
