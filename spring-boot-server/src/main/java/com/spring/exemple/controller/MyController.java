package com.spring.exemple.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/endpoint")
    public ResponseEntity<String> getEndpoint() {
        String message = "Hello, world!";
        return ResponseEntity.ok(message);
    }
}
