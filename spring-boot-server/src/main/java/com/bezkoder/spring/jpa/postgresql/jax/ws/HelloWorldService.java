package com.bezkoder.spring.jpa.postgresql.jax.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldService {
    @WebMethod
    String sayHello(String name);
}