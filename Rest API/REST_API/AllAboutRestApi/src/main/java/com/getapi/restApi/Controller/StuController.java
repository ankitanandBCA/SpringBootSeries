package com.getapi.restApi.Controller;

import com.getapi.restApi.Service.StuService;
import com.getapi.restApi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StuController {

    @Autowired
    StuService stuService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
       return stuService.addStudents(student);
    }


    @GetMapping("/getStudent")
    public List<Student> getAll()
    {
        return stuService.getAllStudent();
    }

    @PutMapping("/Update")
    public Student UpdateStudent(@RequestBody Student s)
    {
         return stuService.updateStudent(s);
    }

    @DeleteMapping("/Delete/{id}")
    public Boolean DeleteStudent(@PathVariable int id)
    {
        return stuService.DeleteStudent(id);
    }
}
