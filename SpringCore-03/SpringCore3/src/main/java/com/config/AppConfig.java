package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spc.Student;

@ComponentScan(basePackages = "com.spc")
@Configuration
public class AppConfig {
	@Bean(value = "stu")
	Student getStudentObj()
	{
		return new Student();
	}

}
