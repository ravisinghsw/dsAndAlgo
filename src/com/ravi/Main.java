package com.ravi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main extends  RuntimeException{

    Runtime a;

    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }
    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }
    static class IE extends Browser {
        @Override public void go() {
            System.out.println("Inside IE");
        }
    }
    public static void main(String[] args) {
        /*Browser b = new Firefox();
        IE e = (IE) b;
        e.go();*/


        Object i = new ArrayList().iterator();
        System.out.println(i instanceof List);
        System.out.println(i instanceof Iterator);
        System.out.println(i instanceof ListIterator);
    }
}
