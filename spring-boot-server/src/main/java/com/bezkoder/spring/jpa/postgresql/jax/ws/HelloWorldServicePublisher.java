package com.bezkoder.spring.jpa.postgresql.jax.ws;

public class HelloWorldServicePublisher {
    public static void main(String[] args) {
       // HelloWorldService service = new HelloWorldServiceImpl();
        String url = "http://localhost:8080/helloWorld";
       // Endpoint.publish(url, service);
        System.out.println("Web service is published at: " + url);
    }
}
