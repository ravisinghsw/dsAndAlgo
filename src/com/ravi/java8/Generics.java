package com.ravi.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ravi on 11/29/2017.
 */
public class Generics {

    public static void main(String[] args) {

        List<?> list1 = new ArrayList<A>();
        //list1.add(new Generics.A());
         List<? extends A> list2 = new ArrayList<A>();
         //list2.add(new Generics.B());
         List<? super A> list3 = new ArrayList<A>();
         //List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
         List<? super B> list5 = new ArrayList<A>();
        // List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

    }

    static class A {}
    static class B extends A { }
    static class C extends B { }
}
