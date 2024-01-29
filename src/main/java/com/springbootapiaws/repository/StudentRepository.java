package com.springbootapiaws.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.springbootapiaws.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    DynamoDBMapper dynamoDBMapper;
    public Student save (Student student){
        dynamoDBMapper.save(student);
        return student;
    }

}
