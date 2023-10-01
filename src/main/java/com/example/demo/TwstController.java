package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class TwstController {
    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Integration Ninjas Tanujj");
        object.put("email", "integrationninjas@gmail.com");
        return object;
    }
    @GetMapping("/test")
    public Object hello2() {
        Map<String, String> object = new HashMap<>();
        object.put("hello", "java");
        object.put("Hi", "tanuj");
        return object;
    }

}
