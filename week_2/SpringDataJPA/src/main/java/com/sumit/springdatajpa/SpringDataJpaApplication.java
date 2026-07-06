package com.sumit.springdatajpa;

import com.sumit.springdatajpa.entity.Department;
import com.sumit.springdatajpa.entity.Student;
import com.sumit.springdatajpa.repository.DepartmentRepository;
import com.sumit.springdatajpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);
        DepartmentRepository departmentRepository = context.getBean(DepartmentRepository.class);

        Department cs = new Department();
        cs.setName("Computer Science");

        Student robin = new Student();
        robin.setFullName("Nico Robin");
        robin.setAge(30);

        robin.setDepartment(cs);

        studentRepository.save(robin);
    }
}