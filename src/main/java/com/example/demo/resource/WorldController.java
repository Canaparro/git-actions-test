package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/helloworld")
public class WorldController {


    @GetMapping
    public String helloWorld() {
        return "Hello world!";
    }

}
