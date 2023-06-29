package com.spring.exemple;

import com.spring.exemple.jax.ws.MyThread;
import org.junit.Test;

public class MyThreadTest {

    @Test
    public void testRunMethod() {
        MyThread myThread = new MyThread();
        myThread.run();
       // assertEquals("Thread is running", getConsoleOutput());
    }

    private String getConsoleOutput() {
        return "";
    }
}
