package com.getapi.restApi.StudentRepo;

import com.getapi.restApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepo extends JpaRepository<Student,Integer> {
}
