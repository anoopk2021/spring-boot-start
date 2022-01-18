package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ListCrudController {

    ArrayList<String> bankList =new ArrayList<>();

    @RequestMapping("/add_to_list")
    public String add(@RequestParam String element){

        bankList.add(element);

        return "Added Successfully "+element;
    }
    @RequestMapping("/get_bank_list")
    public ArrayList<String> getCourseList(){

        return bankList;
    }
    @RequestMapping("/update")
    public String update(@RequestParam String element, @RequestParam int index){

        bankList.set(index,element);

        return "element updated "+element;
    }
    @RequestMapping("/remove")
    public String remove( @RequestParam int index){

        bankList.remove(index);

        return "Element removed Successfully";
    }
}

