package com.springbootapiaws.controller;

import com.springbootapiaws.entity.Student;
import com.springbootapiaws.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student save (@RequestBody Student student){
        return studentRepository.save(student);
    }
}
