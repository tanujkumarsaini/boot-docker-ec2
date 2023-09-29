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
        object.put("name", "Integration Ninjas Tanuj");
        object.put("email", "integrationninjas@gmail.com");
        return object;
    }

}
