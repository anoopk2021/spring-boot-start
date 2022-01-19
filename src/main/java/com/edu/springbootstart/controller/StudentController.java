package com.edu.springbootstart.controller;

        import com.edu.springbootstart.model.Student;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;

@RestController
public class StudentController {


    ArrayList <Student> studentArrayList= new ArrayList<>();


    //ENDPOINT1
    @RequestMapping("/add_student")
    public String add(){

        Student student1= new Student("Raj",23,"CS");
        Student student2= new Student("Arun",24,"IT");
        Student student3= new Student("Sumit",27,"Mechanical");
        Student student4= new Student("rohan",28,"Civil");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        return "Student Added Successfully ....";
    }
    //ENDPOINT2
    @RequestMapping("/get_students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }
    //ENDPOINT3
    //http://localhost:8085/update_student?name=Ram&index=0

    @RequestMapping("/update_student")
    public String update(@RequestParam String name , @RequestParam int index){

        studentArrayList.get(0).setName(index, name);

        return "Name Update Successfully: "+name;
    }
    //ENDPOINT4
    //http://localhost:8085/delete_student?index=0
    @RequestMapping("delete_student")
    public String remove(@RequestParam int index){
        studentArrayList.remove(index);

        return "Element removed successfully";
    }
}