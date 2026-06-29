package com.sumit.springdatajpa.repository;

import com.sumit.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFullName(String fullName);

}
