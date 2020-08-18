package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World 111";
    }

    @GetMapping
    public String redirectHelloWorld() {
        return "Hello World --- Hello Heroku";
    }
}
