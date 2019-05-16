package com.ravi.gc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MemoryLeakProgram implements plugin {

    public static final long[] LOTS_OF_MEMORY = new long[8 * 1024 * 1024];

    ThreadLocal l;

    private ExamplePluginlevel examplePluginlevel = new ExamplePluginlevel();

    @Override
    public void initialize() {

        Logger.getLogger("MemoryLeakProgram").log(examplePluginlevel,"Hello World");

    }

    private class ExamplePluginlevel extends Level {

        protected ExamplePluginlevel() {
            super("Memory Plugin Log level", 1000);
        }
    }
}
