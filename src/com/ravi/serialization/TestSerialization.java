package com.ravi.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

    public static void main(String[] args) throws Exception {

        String file="C:\\Users\\ravi\\IdeaProjects\\temp\\ravi.ser";
        int[] x = {1,2,3,4,5,6,7,8};
        Employee em = new Employee();
        em.setName("Ravi Singh");
        em.setA(x);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream out=new ObjectOutputStream(fileOutputStream);

        out.writeObject(em);
        out.flush();
        System.out.println("success");

    }
}
