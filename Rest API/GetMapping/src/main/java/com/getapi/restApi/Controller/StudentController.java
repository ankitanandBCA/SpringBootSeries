package com.getapi.restApi.Controller;

import com.getapi.restApi.Entity.Student;
import com.getapi.restApi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/stus")

    public String getAllStudents(){
        return "all student mill gaye";
    }

    @GetMapping("/students")
    public List<Student> allStudent()
    {
       return studentService.getAllStudent();
    }

@GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getById(id);
    }
}
