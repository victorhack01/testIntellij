package com.example.testIntellij.controller;


import com.example.testIntellij.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/message")
    public Person getMessage() {
        System.out.println("MEnsaje log!!!!");
        Person person = new Person(1, "Juan");
        return person;
    }
}
