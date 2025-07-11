package com.getapi.restApi.Service;

import com.getapi.restApi.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> list=new ArrayList<>();

    static {
       list.add(new Student(1,"Ankit","ankit@gmail.com"));
       list.add(new Student(2,"Abhi","abhi@gmail.com"));
       list.add(new Student(3,"Surbhi","surbhi@gmail.com"));
       list.add(new Student(4,"Ajay","ajay@gmail.com"));
       list.add(new Student(5,"Rupam","rupam@gmail.com"));


    }
// get all student
    public List<Student> getAllStudent()
    {
        return list;
    }

    // get student by id
    public Student getById(int id) {
        return list.stream()
                .filter(ed -> ed.getId() == id)
                .findFirst()
                .orElse(null);  // agar koi student nahi mila to null return karega
    }





    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }
}
