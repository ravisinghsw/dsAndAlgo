package com.ravi.gc;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.Executors;

public class ApplicationRunner {

    public static void main(String[] args) throws Exception {

        final String className = "com.ravi.gc.MemoryLeakProgram";

        while (true){
            System.out.println("Press any key to reload plugins");
            System.in.read();

            final URL[] urls = {new File("C:\\Users\\ravi\\IdeaProjects\\algo\\out\\production\\algo").toURI().toURL()};
            final URLClassLoader  classLoader = new URLClassLoader(urls,null);

            Class<?> aClass = classLoader.loadClass(className);
            Object obj =  aClass.newInstance();

            aClass.getMethod("initialize").invoke(obj);

        }

    }
}
