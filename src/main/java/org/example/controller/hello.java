package org.example.controller;

import command.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hello {

    @GetMapping("/hello")
    public String hello(){
        String str = "hello gun";
        return str;
    }

    @PostMapping("/commandtest")
    public String testperson( Person person){
        return person.info();
    }
}
