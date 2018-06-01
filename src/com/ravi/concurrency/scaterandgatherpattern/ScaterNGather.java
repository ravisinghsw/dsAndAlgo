package com.ravi.concurrency.scaterandgatherpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;

public class ScaterNGather {

    private static String[] result = {"YES","NO" , "Can't Say" };

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        ExecutorCompletionService<String> ecs = new ExecutorCompletionService<>(Executors.newCachedThreadPool());
       // ExecutorService pool = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>();

        for(int i =0 ;i<10 ; i++) {

            Future<String> future = ecs.submit(()->{
                Random r = new Random();
                int wait = r.nextInt(10000-2000)+2000;
                int randomResult = r.nextInt(3-0)+0;
                System.out.println(Thread.currentThread() + " Waiting for "+wait + " to publish result ::"+result[randomResult]);
                Thread.sleep(wait);
                return result[randomResult];
            }) ;

            futureList.add(future);
        }

        /*futureList.stream().forEach(a->{
            try {
                System.out.println(a.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });*/
        Map<String,Integer> resultHolder = new ConcurrentHashMap<>();
        resultHolder.put("YES",0);
        resultHolder.put("NO",0);
        resultHolder.put("Can't Say",0);
        for(int i =0 ;i<10 ; i++) {
            String result = ecs.take().get() ;
            resultHolder.put(result,resultHolder.get(result) + 1) ;

            System.out.print("YES ::"+(resultHolder.get("YES")*10)+"%" );
            System.out.print("  NO ::"+(resultHolder.get("NO")*10)+"%");
            System.out.print("  Can't Say ::"+(resultHolder.get("Can't Say")*10)+"%");
            System.out.println();
        }


    }
}
