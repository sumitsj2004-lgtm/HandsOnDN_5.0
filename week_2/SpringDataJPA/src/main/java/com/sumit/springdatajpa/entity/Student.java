package com.sumit.springdatajpa.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private int age;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Department department;

    public Student(){}

    public Student(Long id, String fullName, int age){
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}