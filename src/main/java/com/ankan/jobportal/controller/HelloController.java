package com.ankan.jobportal.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    /*
    *
    *
    * Client request
            ↓
     DispatcherServlet
            ↓
      HelloController
            ↓
        sayHello()
            ↓
      Return response
    *
    * */
    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> sayHello(){

        // We use Hashmap, to send a response in json format
        Map<String, String> response = new HashMap<>();

        response.put("message", "Hello, Welcome to Job Portal system Backend");

        // To embed it in a single entity, we should use the annotation @ResponseEntity

        return ResponseEntity.status(200).body(response);
    }
}
