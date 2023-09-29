package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class TwstController {
    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Integration Ninjas");
        object.put("email", "integrationninjas@gmail.com");
        return object;
    }

}
