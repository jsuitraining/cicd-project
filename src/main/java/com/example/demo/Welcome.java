package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/hi")
    public String getNotes(){
        return "welcome to cicd of spring boot project";
    }
}
