package com.sumit.springdatajpa;

import com.sumit.springdatajpa.entity.Course;
import com.sumit.springdatajpa.entity.Department;
import com.sumit.springdatajpa.entity.Student;
import com.sumit.springdatajpa.entity.StudentIdCard;
import com.sumit.springdatajpa.repository.CourseRepository;
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
        CourseRepository courseRepository = context.getBean(CourseRepository.class);

        Department cs = new Department();
        cs.setName("Computer Science");
        Department arc = new Department();
        arc.setName("Archeology");

        StudentIdCard id_card = new StudentIdCard();
        id_card.setCardNumber("Card101");
        StudentIdCard id_card1 = new StudentIdCard();
        id_card1.setCardNumber("Card102");

        Course java = new Course();
        java.setName("Java");
        Course dbms = new Course();
        dbms.setName("DBMS");
        Course os = new Course();
        os.setName("Operating Systems");
        courseRepository.save(java);
        courseRepository.save(dbms);
        courseRepository.save(os);

        Student luffy = new Student();
        luffy.setFullName("Mugiwara Luffy");
        luffy.setAge(19);

        Student robin = new Student();
        robin.setFullName("Nico Robin");
        robin.setAge(21);

        luffy.setDepartment(cs);
        luffy.setStudentIdCard(id_card);
        luffy.setCourses(List.of(java, dbms));

        robin.setDepartment(arc);
        robin.setStudentIdCard(id_card1);
        robin.setCourses(List.of(java, os));

        studentRepository.save(luffy);
        studentRepository.save(robin);
    }
}