package com.mapping.example;

import com.mapping.example.entity.Laptop;
import com.mapping.example.entity.Student;
import com.mapping.example.repositry.LaptopRepo;
import com.mapping.example.repositry.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMappingApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	LaptopRepo laptopRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMappingApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Application started...");

		Student student = new Student();
		student.setStudentname("ankit Anand");
		student.setAbout("I am software developer");
		student.setStuentId(103);

		Laptop laptop = new Laptop();
		laptop.setModelnumber("222222");
		laptop.setBrand("HP");
		laptop.setLaptopId(3);
		laptop.setStudent(student);



		Student saved = studentRepo.save(student);

		laptopRepo.save(laptop);
		System.out.println("Student saved: " + saved.getStudentname());
	}
}
