package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.entity.Students;
import com.crud.demo.repositry.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public Students addStudent(Students s) {
		return sr.save(s);
	}
	
	
	public List<Students> getAll()
	{
		return sr.findAll();
	}
	
	public Students updatestudents(Students updates)
	{
		Optional<Students> ss= sr.findById(updates.getId());
		Students s1=ss.get();
		s1.setName(updates.getName());
		
		   return sr.save(s1);
	}
	
	
	public Boolean deletestudents(int id)
	{
	    sr.deleteById(id);
		return true;
	}

}
