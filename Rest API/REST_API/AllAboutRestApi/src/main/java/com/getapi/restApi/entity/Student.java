package com.getapi.restApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")          // optional, par accha practice hai
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // auto‑increment PK
    private Integer id;           // ←  primary key

    private String name;
    private int age;              // example extra field

    // ===== Constructors =====
    public Student() {}           // JPA ko no‑arg ctor chahiye

    public Student(String name, int age) {   // convenience ctor
        this.name = name;
        this.age  = age;
    }

    // ===== Getters / Setters =====
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }






}
