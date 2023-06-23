package com.bezkoder.spring.jpa.postgresql.jax.ws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldServiceClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/helloWorld?wsdl");
        QName qname = new QName("http://example.com/", "HelloWorldServiceImplService");

        Service service = Service.create(url, qname);
        HelloWorldService helloService = service.getPort(HelloWorldService.class);

        String response = helloService.sayHello("John");
        System.out.println(response);
    }
}
