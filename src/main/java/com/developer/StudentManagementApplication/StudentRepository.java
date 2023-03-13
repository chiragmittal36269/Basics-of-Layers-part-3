package com.developer.StudentManagementApplication;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentRepository {

    Map<Integer, Student> db = new HashMap<>();


    public Student getStudent(int admnNo)
    {
        return db.get(admnNo);
    }

    public void addStudent(Student student)
    {
        db.put(student.getAdmnNo(), student);
    }

}
