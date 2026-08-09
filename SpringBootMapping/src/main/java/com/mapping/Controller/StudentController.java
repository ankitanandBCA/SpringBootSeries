package com.mapping.Controller;

import com.mapping.Entity.Student;
import com.mapping.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/sav/{dept_id}")
    public Student adds(
            @RequestBody Student student,
            @PathVariable Long dept_id) {

        return studentService.add(student, dept_id);
    }

    @GetMapping("/all")
    public List<Student> ge() {
        return studentService.gets();
    }

    @PutMapping("/{id}/{dept_id}")
    public Student ups(
            @RequestBody Student s,
            @PathVariable Long id,
            @PathVariable Long dept_id) {

        return studentService.upds(s, id, dept_id);
    }

    @DeleteMapping("/del/{id}")
    public String dels(@PathVariable Long id) {

        studentService.delete(id);

        return "Data deleted";
    }
}