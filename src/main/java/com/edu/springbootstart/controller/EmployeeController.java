package com.edu.springbootstart.controller;

import com.edu.springbootstart.model.Employee;
import com.edu.springbootstart.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    // ArrayList <Employee> employeeArrayList= new ArrayList<>();

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    //ENDPOINT1
    @RequestMapping("/add_employee")
    public String add(@RequestBody Employee employee){


        employeeJpaRepository.save(employee);

        return "Employee Added Successfully ....";
    }



    //ENDPOINT2
    @RequestMapping("/get_employees")
    public List<Employee> getEmployeeArrayList(){

        return employeeJpaRepository.findAll();
    }
    //ENDPOINT3
    @RequestMapping("/update_employee")
    public String update(@RequestParam String name, @RequestParam Long id){

        Employee employee=employeeJpaRepository.getById(id);
        employee.setName(name);
        employeeJpaRepository.save(employee);

        return "Name Update Successfully: "+name;
    }
    //ENDPOINT4
    @RequestMapping("/delete_employee")
    public String remove(@RequestParam Long index){
        employeeJpaRepository.deleteById(index);

        return "Element removed successfully";
    }
}