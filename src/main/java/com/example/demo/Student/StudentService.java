package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(new Student(1L,"Omer","omer@gmail.com", LocalDate.of(1999, Month.SEPTEMBER,2),25));
    }
}
