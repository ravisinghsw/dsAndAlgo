package com.ravi.geekforgeeks.array;

import java.util.*;

public class MissingInteger {

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};


        String S = "\"Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00\"";
        S  = S.replaceAll("\"","");
        solution(S);
    }

    public static int solution(String S) {
        int min = 0;
        int [] day = new int[24];
        Map<String,int[]> daysTimeMap = new HashMap<>();


        String[] s = S.split("\n");

        for(int i = 0 ; i < s.length ; i ++){
            String[] dayTime = s[i].split(" ");
            String[] time = dayTime[1].split("-");

            System.out.println(dayTime[0] + " starttime "+time[0] + "  endtime "+time[1]);
            int[] hrList = new int[24];

            if(daysTimeMap.get(dayTime[0])!=null){
                hrList = daysTimeMap.get(dayTime[0]);
            }
            String[] startHhMm = time[0].split(":");
            int startHr = Integer.parseInt(startHhMm[0]);
            int startMm = Integer.parseInt(startHhMm[1]);

            String[] endHhMm = time[1].split(":");
            int endHr = Integer.parseInt(endHhMm[0]);
            int endMm = Integer.parseInt(endHhMm[1]);
            hrList[startHr] =startMm;
            for(int tt = startHr+ 1; tt <endHr ; tt++) {
                hrList[tt] =60;
            }

            hrList[endHr] =endMm;
            daysTimeMap.put(dayTime[0] , hrList);
        }

        System.out.println(daysTimeMap);
        return min;
    }


}
