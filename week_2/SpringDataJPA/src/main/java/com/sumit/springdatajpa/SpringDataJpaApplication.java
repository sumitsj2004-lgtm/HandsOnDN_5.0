package com.sumit.springdatajpa;

import com.sumit.springdatajpa.entity.Student;
import com.sumit.springdatajpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepository repository = context.getBean(StudentRepository.class);

        // #1- We created first
        //Student robin = new Student(1L,"Robin");
        //repository.save(robin);

        // #2 - We search our creation
        //List<Student> students = repository.findAll();
        //for(Student student : students) {
        //    System.out.println(student.getId() + " " + student.getFullName());
        //}

        // #3 - We update, same save() but now updation happens, cause id 1 already exists
        //Student batman = new Student(1L, "Batman");
        //repository.save(batman);
        //List<Student> students = repository.findAll();
        //for(Student student : students) {
        //    System.out.println(student.getId() + " " + student.getFullName());
        //}

        // #4 - We delete
        repository.deleteById(1L);

    }

}
