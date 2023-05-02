package com.staimov.hellogit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${greet}")
    private String greet;

    @GetMapping("/hello")
    public  String helloWorld() {
        return greet;
    }
}
