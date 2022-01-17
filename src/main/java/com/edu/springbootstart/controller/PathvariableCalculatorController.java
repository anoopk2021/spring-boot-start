package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathvariableCalculatorController {

    @RequestMapping("/add/{a}/{b}")
    public String  addition(@PathVariable int a, @PathVariable int b){

        int sum=a+b;
        return  "Addition of a and b is: "+sum;
    }

    @RequestMapping("/sub/{a}/{b}")
    public String  subtraction(@PathVariable int a, @PathVariable int b) {

        int sum = a - b;
        return "Subtraction of a and b is: " + sum;
    }

    @RequestMapping("/multi/{a}/{b}")
    public String  multiplication(@PathVariable int a, @PathVariable int b) {

        int sum = a * b;
        return "Multiplication of a and b is: " + sum;
    }

    @RequestMapping("/divide/{a}/{b}")
    public String  Division(@PathVariable int a, @PathVariable int b) {

        int sum = a / b;
        return "Division of a and b is: " + sum;
    }


}
