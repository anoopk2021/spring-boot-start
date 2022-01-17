package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("/add")
    public String addition() {
        int a = 5;
        int b = 7;
        int sum = a + b;
        return "Addition of a and b is " + sum;
    }

    @RequestMapping("/sub")
    public String subtraction() {
        int a = 15;
        int b = 7;
        int sum = a - b;
        return "Subtraction of a and b is " + sum;
    }

    @RequestMapping("/multi")
    public String multipication() {
        int a = 5;
        int b = 7;
        int sum = a * b;
        return "Multipication of a and b is " + sum;
    }

    @RequestMapping("/divide")
    public String division() {
        int a = 50;
        int b = 10;
        int sum = a / b;
        return "Division of a and b is " + sum;
    }
}