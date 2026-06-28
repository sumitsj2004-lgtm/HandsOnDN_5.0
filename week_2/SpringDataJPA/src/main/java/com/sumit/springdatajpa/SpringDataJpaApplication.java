package com.sumit.springdatajpa;

import com.sumit.springdatajpa.entity.Student;
import com.sumit.springdatajpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepository repository = context.getBean(StudentRepository.class);

        Student robin = new Student(1L,"Robin");

        repository.save(robin);
    }

}
