package com.mapping.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

@Entity
public class Teacher {

    @Id
    private int teacherId;
    private String teacherName;
    private String teacherAbout;

    @OneToMany
    private List<Stbject> stbject;

    public Teacher(int teacherId, String teacherName, String teacherAbout, Stbject stbject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherAbout = teacherAbout;
        this.stbject = Collections.singletonList(stbject);
    }

    public Teacher() {

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAbout() {
        return teacherAbout;
    }

    public void setTeacherAbout(String teacherAbout) {
        this.teacherAbout = teacherAbout;
    }

    public Stbject getStbject() {
        return (Stbject) stbject;
    }

    public void setStbject(Stbject stbject) {
        this.stbject = Collections.singletonList(stbject);
    }
}
