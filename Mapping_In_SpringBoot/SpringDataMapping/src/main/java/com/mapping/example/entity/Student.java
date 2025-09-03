package com.mapping.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int stuentId;
    private String studentname;
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student(int stuentId, String studentname, String about, Laptop laptop) {
        this.stuentId = stuentId;
        this.studentname = studentname;
        this.about = about;
        this.laptop = laptop;
    }

    public Student() {

    }

    public int getStuentId() {
        return stuentId;
    }

    public void setStuentId(int stuentId) {
        this.stuentId = stuentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
