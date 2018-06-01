package com.ravi.concurrency.fireandforgetpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class UsingBlockingQueue {

    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 10 ;

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(1);
        List<Runnable> list = new ArrayList<>();

        new Thread(()->{
            list.add(()->{
            try {Thread.sleep(1000);  } catch (InterruptedException e) { e.printStackTrace();}
            System.out.println(Thread.currentThread()+"Performing Summation " + (a+b));});
            list.add(()->{   try {Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace();}
            System.out.println(Thread.currentThread()+"Performing Muliplication " + (a*b));});
            list.add(()->{
            try {Thread.sleep(1500);  } catch (InterruptedException e) { e.printStackTrace();}System.out.println(Thread.currentThread()+"Performing Division " + (b/a));});
            list.add(()->{   try {Thread.sleep(500);  } catch (InterruptedException e) { e.printStackTrace();}
            System.out.println(Thread.currentThread()+"Performing Mod " + (a%b));});

            list.stream().forEach(worker->{
               while (!queue.offer(worker)){
                   try {Thread.sleep(10);  } catch (InterruptedException e) { e.printStackTrace();}
                    System.out.println("Waiting for Queue to be empty " + queue.size());
               };
            });

        }).start(); ;
        while (true) {
            int mb = 1024 * 1024;
            // get Runtime instance
            Runtime instance = Runtime.getRuntime();
            System.out.println("***** Heap utilization statistics [MB] *****\n");
            // available memory
            System.out.println("Total Memory: " + instance.totalMemory() / mb);

            // free memory
            System.out.println("Free Memory: " + instance.freeMemory() / mb);

            // used memory
            System.out.println("Used Memory: "
                    + (instance.totalMemory() - instance.freeMemory()) / mb);

            // Maximum available memory
            System.out.println("Max Memory: " + instance.maxMemory() / mb);
            Executors.newWorkStealingPool().submit(queue.take());
        }



    }
}
