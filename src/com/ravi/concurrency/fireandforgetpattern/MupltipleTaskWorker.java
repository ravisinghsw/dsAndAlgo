package com.ravi.concurrency.fireandforgetpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Using Executors
 */
public class MupltipleTaskWorker {

    private static ExecutorService getPool(){
       // ExecutorService pool = Executors.newCachedThreadPool();

        ExecutorService pool = Executors.newWorkStealingPool();
        return pool;

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int a = 5;
        int b = 10 ;

        ExecutorService exe = getPool();

        List<Future> futureList = new ArrayList<>();

        futureList.add( exe.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"Performing Summation " + (a+b));
            }));

        futureList.add(exe.submit(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"Performing Multiplication "+(a*b));
        }));

        futureList.add(exe.submit(()->{
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"performing division : "+(b/a));
        }));

        futureList.add(exe.submit(()->{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"performing mod : "+(b%a));
        }));


        futureList.stream().forEach(data-> {
            try {
                System.out.println(data.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exe.shutdown();
            }
        });

    }



}
