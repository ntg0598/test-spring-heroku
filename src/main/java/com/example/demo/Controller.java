package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello-world")
@RestController
public class Controller {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
