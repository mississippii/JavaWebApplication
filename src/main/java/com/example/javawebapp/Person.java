package com.example.javawebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
@RequestMapping("/Api")
    public String Display(){
        return "Hello Spring";
    }
    @RequestMapping
    public  String GetString(){
        return "Hello Spring Boot...!";
    }
}
