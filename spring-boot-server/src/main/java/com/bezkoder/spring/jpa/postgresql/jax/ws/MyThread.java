package com.bezkoder.spring.jpa.postgresql.jax.ws;

public class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();
    }
}
