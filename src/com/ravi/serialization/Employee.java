package com.ravi.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Employee implements Serializable{


    private static final long serialVersionUID = 8089421010526262338L;

    private int[] a = new int[5];

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "a=" + Arrays.toString(a) +
                ", name='" + name + '\'' +
                '}';
    }
}
