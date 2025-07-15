package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.entity.Students;
import com.crud.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/add")
	@CrossOrigin(origins="http://127.0.0.1:5500")
	public Students addStudentt(@RequestBody Students s)
	{
		return ss.addStudent(s);
	}
	
	
	@GetMapping("/getall")
	@CrossOrigin(origins="http://127.0.0.1:5500")
	public List<Students> find()
	{
		return ss.getAll();
	}
	
	@PutMapping("update/{id}")
	@CrossOrigin(origins="http://127.0.0.1:5500")
	public Students updatestu(@RequestBody Students s)
	{
		return ss.updatestudents(s);
	}

	
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins="http://127.0.0.1:5500")
	public Boolean deletestudents(@PathVariable int id)
	{
		return ss.deletestudents(id);
	}
	
}
