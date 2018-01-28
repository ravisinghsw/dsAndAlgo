package com.ravi.java8;

import com.ravi.Main;

import java.lang.reflect.Method;

/**
 * Created by ravi on 11/10/2017.
 */
public class CCRun {

    public static void main(String[] args) throws  Exception{
        System.out.println("Current Class Loader : "+ CCRun.class.getClassLoader());

        CClassLoader cl = new CClassLoader(CCRun.class.getClassLoader());

        Class cls = cl.loadClass("com.ravi.number_theory.GCD");
        Class mainArgType[] = { (new String[0]).getClass() };
        Method main = cls.getMethod("main", mainArgType);
        Object argsArray[] = { new Object() };

        main.invoke(null , null);


    }
}
