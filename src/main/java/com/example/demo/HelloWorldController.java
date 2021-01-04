package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${hello-world:default for hello world}") String helloWorld;

    @GetMapping("/hello-world")
    public String helloWorldFromConfig() {
        return helloWorld;
    }
}
