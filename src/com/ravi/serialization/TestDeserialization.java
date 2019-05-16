package com.ravi.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

    public static void main(String[] args) throws Exception {

        String file="C:\\Users\\ravi\\IdeaProjects\\temp\\ravi.ser";



        FileInputStream fileOutputStream = new FileInputStream(file);

        ObjectInputStream ip=new ObjectInputStream(fileOutputStream);

        Employee em = (Employee)ip.readObject();

        System.out.println("success "+em);

    }
}
