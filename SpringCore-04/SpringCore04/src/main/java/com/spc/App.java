package com.spc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Autowired.Emp;
import com.ConFiguraction.AppConfig;
import com.ConFiguraction.AppConfig2;
import com.ConFiguraction.AppConfig3;
import com.Qulifire.NonVegPizza;
import com.Qulifire.Pizza;
import com.Qulifire.VegPizza;


public class App {
    public static void main(String[] args) {
        // Creating application context using annotation-based configuration
       /*
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            Student student=(Student)context.getBean("student");
            student.setId(101);
            student.setName("ankit anand");
            student.setPercentage(70.94);
            System.out.println(student);
       
        context.close();
        */
    	
    	
    	//  @autowired annotaion using the application
   	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
    	
    	Emp emp=(Emp)context.getBean(Emp.class);
    	emp.setId(101);
        emp.setName("Ankit Anand");
        emp.setRole("Full Stack Developer");

    	emp.getAddress().setStreet("Bhagalpur");
    	emp.getAddress().setCity("bihar");
    	System.out.println(emp);
    
    	
    
    }
}
