package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DemoController {

    //Endpoint1
    @RequestMapping("/hello")
    public void hello (){
        System.out.println("New Demo Project Spring Boot");
    }
    //ENDPOINT 2
    @RequestMapping("/message")
    public String message(){

        return "Hello,This is from Spring Boot";
    }
    //ENDPOINT 3
    @RequestMapping("/course")
    public List<String> names(){

        ArrayList<String > name=new ArrayList<>();
        name.add("Java");
        name.add("Spring");
        name.add("Soring Boot");
        name.add("Cloud and MS");

        return name;
    }
}
