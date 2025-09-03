package com.mapping.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

    @Id
    private int laptopId;
    private String modelnumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;

    public Laptop(int laptopId, String modelnumber, String brand, Student student) {
        this.laptopId = laptopId;
        this.modelnumber = modelnumber;
        this.brand = brand;
        this.student = student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop() {

    }
}
