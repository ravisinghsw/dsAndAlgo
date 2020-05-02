package com.ravi.geekforgeeks.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
 * Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 * <p>
 * For example , the list of all anagrammatic pairs is  at positions  respectively.
 * <p>
 * <p>
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class Anagrams {

    public static void main(String[] args) {

        String word = "KKKK";

        Map<String ,Integer> testCases = new LinkedHashMap<>();
        testCases.put("mom",3);
        testCases.put("abba",4);
        testCases.put("abcd",0);
        testCases.put("ifailuhkqq",3);
        testCases.put("kkkk",10);
        testCases.put("cdcd",5);

        testCases.forEach( (k,v)->{
           // System.out.println(k+" expected "+v+ " actual "+sherlockAndAnagrams(k));
        });
        System.out.println(sherlockAndAnagrams("kkkk"));
        System.out.println(sherlockAndAnagrams("kkkk"));
        System.out.println();



    }


    static int numberOfAnagrams = 0;
    static int sherlockAndAnagrams(String s) {

        int length = s.length();
        Map<String,Integer> map = new LinkedHashMap<>();
        Map<Integer,Integer> anagramCountMap = new LinkedHashMap<>();
        int scount = 0;
        for (int i = 0; i < length; i++) {
            scount = scount+ s.charAt(i);
        }
        //anagramCountMap.put(scount,1 );
        for (int i = 0; i < length; i++) {
            String key = "";
            int sum = 0;
            for(int j = i ; j < length ; j++){
                key = key+ s.charAt(j);
               /*
                if(map.get(key)!=null){
                    map.put(key,map.get(key)+1);
                } else {
                    map.put(key,1);
                }*/
                sum = sum +  s.charAt(j);
                if(anagramCountMap.get(sum)!=null){
                    numberOfAnagrams++;
                    anagramCountMap.put(sum,anagramCountMap.get(sum) + 1);
                } else {
                    anagramCountMap.put(sum,1);
                }

            }
        }
        System.out.println(numberOfAnagrams);
        System.out.println(anagramCountMap);

        for(String key  : map.keySet()){
            if(map.get(key)>1){
                numberOfAnagrams ++ ;
            }
        }
        return numberOfAnagrams;
    }


}
