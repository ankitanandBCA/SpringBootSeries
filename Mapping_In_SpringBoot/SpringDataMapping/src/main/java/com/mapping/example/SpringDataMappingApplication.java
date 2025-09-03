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

		@Autowired
	TeacherRepo teacherRepo;
	@Autowired
	StbjectRepo stbjectRepo;

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



	// one to many            and               manyToOne

		Teacher teacher=new Teacher();
		teacher.setTeacherId(102);
		teacher.setTeacherName("rohit kumar");
		teacher.setTeacherAbout("this is good teacher");

		Teacher save = teacherRepo.save(teacher);
		System.out.println("teacher save..."+teacher.getTeacherName());

		Stbject stbject=new Stbject();
		stbject.setSuvjectId(6);
		stbject.setSubjectName("physics Science");
		stbject.setSubjectDuraction("8 Week");
		stbject.setTeacher(teacher);

		Stbject save1 = stbjectRepo.save(stbject);
		System.out.println("Subject save...");






		
	}
}
