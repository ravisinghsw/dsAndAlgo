package com.ravi.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * Created by ravi on 10/14/2017.
 */
public class PrimeNumber {

    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String N = br.readLine();*/
        String N = "1000";
        String out_ = PrimeDigitNumber(N);
        System.out.println(out_);

       /* wr.close();
        br.close();*/
    }


    static String PrimeDigitNumber(String N){
        String temp = N ;
        Stack<String> re = new Stack<>();
        if(N !=null && (N.length() >=1 && N.length() <=100000)){
            int n = N.length()-1;
            while(n < 0){
                String result="";
                String last = ""+N.charAt(n);
                Integer lastVal = null;
                try {
                    lastVal =  Integer.parseInt(last);
                }catch (Exception ex) {
                    return "";
                }
                if(lastVal >=7 || lastVal==0){
                    result = ""+7 ;
                } else if(lastVal >4 && lastVal<=6){
                    result = ""+5 ;
                } else if(lastVal >=3 && lastVal<=4){
                    result = ""+3 ;
                } else if(lastVal >1 && lastVal<3){
                    result = ""+2 ;
                } else if (lastVal==1 && N.length()>=1 ){
                    result = ""+7 ;
                }
                re.push(result);
                n--;
            }
         }
        if(N.length()==1){
            try {
                int lastVal =  Integer.parseInt(N);
                if (lastVal<2 && temp.length()==1){
                    re.push("NA" );
                }  if (lastVal<2 ){
                    re.push("" );
                }else {
                    String result = "";
                    if(lastVal >=7 || lastVal==0){
                        result = ""+7 ;
                    } else if(lastVal >4 && lastVal<=6){
                        result = ""+5 ;
                    } else if(lastVal >=3 && lastVal<=4){
                        result = ""+3 ;
                    } else if(lastVal >1 && lastVal<3){
                        result = ""+2 ;
                    } else if (lastVal==1 && N.length()>=1 ){
                        result = ""+7 ;
                    }
                    re.push(result);

                }
            }catch (Exception ex) {
                return "";
            }
        }
         String result = "";
         while(!re.isEmpty()){
             result = result+re.pop();
         }

        if(result.contains("NA"))
            result="";
        return result;
    }
}
