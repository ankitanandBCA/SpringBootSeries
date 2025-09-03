package com.mapping.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Stbject {

    @Id
private int suvjectId;
private String subjectName;
private String subjectDuraction;

@ManyToOne
private Teacher teacher;

    public Stbject(int suvjectId, String subjectName, String subjectDuraction, Teacher teacher) {
        this.suvjectId = suvjectId;
        this.subjectName = subjectName;
        this.subjectDuraction = subjectDuraction;
        this.teacher = teacher;
    }

    public Stbject() {

    }

    public int getSuvjectId() {
        return suvjectId;
    }

    public void setSuvjectId(int suvjectId) {
        this.suvjectId = suvjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDuraction() {
        return subjectDuraction;
    }

    public void setSubjectDuraction(String subjectDuraction) {
        this.subjectDuraction = subjectDuraction;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
