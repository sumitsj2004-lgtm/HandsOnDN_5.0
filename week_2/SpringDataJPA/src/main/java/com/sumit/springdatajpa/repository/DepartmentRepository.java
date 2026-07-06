package com.sumit.springdatajpa.repository;

import com.sumit.springdatajpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

}