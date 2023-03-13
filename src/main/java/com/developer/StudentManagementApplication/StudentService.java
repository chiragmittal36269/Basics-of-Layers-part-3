package com.developer.StudentManagementApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student getStudent(int admnNo)
    {
        return studentRepository.getStudent(admnNo);
    }


    public void addStudent(Student student)
    {
        studentRepository.addStudent(student);
    }

}
