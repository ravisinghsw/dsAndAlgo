package com.ravi.java8;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ravi on 11/10/2017.
 */
public class CClassLoader extends ClassLoader {

    public CClassLoader(ClassLoader parent){
        super(parent);
    }

    @Override
    public Class loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loading Class '" + name + "'");

        if(name.startsWith("com.ravi.number_theory")) {
            System.out.println("Loading Class using CCLoader");
            return  getClass(name);
        }
        return  super.loadClass(name);
    }

    private Class getClass(String name) throws  ClassNotFoundException {
        String file = name.replace('.', File.separatorChar) + ".class";
        byte[] b = null;
        try {
            b = loadClassFileData(file);

            Class c = defineClass(name , b,0 ,b.length);
            resolveClass(c);
            return  c;
        } catch (Exception ex ){
            ex.printStackTrace();
            return  null;
        }
    }

    private byte[] loadClassFileData(String file) throws IOException {

        InputStream stream = getClass().getClassLoader().getResourceAsStream(file);
        int size = stream.available();

        byte[] buff = new byte[size];

        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();

        return buff ;


    }

}
