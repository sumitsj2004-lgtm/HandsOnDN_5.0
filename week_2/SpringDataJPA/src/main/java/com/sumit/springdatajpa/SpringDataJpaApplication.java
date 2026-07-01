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

        /*Student s1 = new Student(1L, "Robin", 22);
        Student s2 = new Student(2L, "Bruce", 25);
        Student s3 = new Student(3L, "Robert", 20);

        repository.save(s1);
        repository.save(s2);
        repository.save(s3);*/


        //List<Student> students = repository.findByFullName("Robin");
        //List<Student> students = repository.findByFullNameStartingWith("Rob");
        //List<Student> students = repository.findByAgeGreaterThan(20);
        //List<Student> students = repository.findStudentByName("Robin");
        List<Student> students = repository.findStudentByNameNative("Robin");
        for(Student stu : students){
            System.out.println(
                    stu.getId() + " " +
                    stu.getFullName()+ " " +
                    stu.getAge()
            );
        }
    }
}