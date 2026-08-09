package com.mapping.Service;

import com.mapping.Entity.Department;
import com.mapping.Entity.Student;
import com.mapping.Repositry.DepartmentRepository;
import com.mapping.Repositry.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepositry studentRepositry;

    @Autowired
    private DepartmentRepository departmentRepository;

    // add
    public Student add(Student student, Long dept_id) {

        Department department = departmentRepository.findById(dept_id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        student.setDepartment(department);
        department.getStudents().add(student);

        return studentRepositry.save(student);
    }

    // get

    public List<Student> gets()
    {
        return studentRepositry.findAll();
    }


    // update

    public Student upds(Student s, Long id,Long dept_id) {

        Student student = studentRepositry.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Department department = departmentRepository.findById(dept_id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        student.setName(s.getName());
        student.setEmail(s.getEmail());
        student.setDepartment(department);

        return studentRepositry.save(student);
    }


    // delete

    public void delete(Long id)
    {
        studentRepositry.deleteById(id);
    }
}
