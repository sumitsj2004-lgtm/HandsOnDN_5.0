package com.sumit.springdatajpa.repository;

import com.sumit.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFullName(String fullName);
    List<Student> findByFullNameStartingWith(String prefix);
    List<Student> findByAgeGreaterThan(int age);

    @Query("SELECT s FROM Student s WHERE s.fullName = :name")
    List<Student> findStudentByName(@Param("name") String fullName);

    @Query(
            value = "SELECT * FROM student WHERE full_name = :name",
            nativeQuery = true
    )
    List<Student> findStudentByNameNative(@Param("name") String name);
}
