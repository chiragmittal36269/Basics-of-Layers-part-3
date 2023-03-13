package com.developer.StudentManagementApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo)
    {
        return studentService.getStudent(admnNo);
    }


    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody() Student student)
    {
        studentService.addStudent(student);
        return new ResponseEntity<>("new Student added Successfully", HttpStatus.CREATED);
    }
}
