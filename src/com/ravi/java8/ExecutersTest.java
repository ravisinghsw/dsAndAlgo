package com.ravi.java8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ravi on 10/28/2017.
 */
public class ExecutersTest {

    public  static void main (String[] args ){

        Runtime rt = Runtime.getRuntime();

        System.out.println(rt.availableProcessors());

        Lock lock = new ReentrantLock();

        Executor ex = Executors.newCachedThreadPool();

    }
}
