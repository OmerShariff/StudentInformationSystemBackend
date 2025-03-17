package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student omer=new Student("Omer","omer@gmail.com", LocalDate.of(1999, Month.SEPTEMBER,2));
          Student sheriff=new Student("Sheriff","omer@gmail.com", LocalDate.of(1999, Month.SEPTEMBER,2));
          repository.saveAll(
          List.of(omer,sheriff)
          );
        };
    }
}
