package com.getapi.restApi.Service;

import com.getapi.restApi.StudentRepo.StuRepo;
import com.getapi.restApi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StuService {

    @Autowired
    StuRepo stuRepo;

    public Student addStudents(Student student)
    {
       return stuRepo.save(student);
    }


    public List<Student> getAllStudent()
    {
         return stuRepo.findAll();
    }

    public Student updateStudent(Student student)
    {
        Optional<Student> byId = stuRepo.findById(student.getId());
        Student student1 = byId.get();
        student1.setName(student.getName());

         return stuRepo.save(student1);
    }

    public Boolean DeleteStudent(int id)
    {
        stuRepo.deleteById(id);
        return true;
    }
}
