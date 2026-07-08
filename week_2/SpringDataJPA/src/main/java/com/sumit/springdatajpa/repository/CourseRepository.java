package com.sumit.springdatajpa.repository;

import com.sumit.springdatajpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
