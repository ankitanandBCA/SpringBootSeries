package com.getapi.restApi.Controller;

import com.getapi.restApi.Entity.Student;
import com.getapi.restApi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;





    @PostMapping("/addStudent")
    public  Student getAllBookAdd(@RequestBody Student student)
    {
         Student s=this.studentService.addStudent(student);
         return s;

    }
}
