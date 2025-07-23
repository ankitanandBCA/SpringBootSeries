package com.CFMCQ.test;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.CFMCQ.test.entity.Employee;
import com.CFMCQ.test.repositry.EmployeeRepo;

@SpringBootApplication
public class CustomFinderMethodCustomQueryApplication {

   
	public static void main(String[] args) {
		
	 ConfigurableApplicationContext ap=SpringApplication.run(CustomFinderMethodCustomQueryApplication.class, args);
	  EmployeeRepo er=ap.getBean(EmployeeRepo.class);
	  
	  
	  /* 
	  Employee e1=new Employee();
	  e1.setId(1);
	  e1.setName("aman kumar");
	  e1.setEmai("aman@gmail.com");
	  e1.setPassword("aman1234");
	  
	  Employee e2=new Employee();
	  e2.setId(2);
	  e2.setName("suman yadav");
	  e2.setEmai("suman@gmail.com");
	  e2.setPassword("suman@123456");
	 
	     List<Employee> allemp=List.of(e1,e2);
	     Iterable<Employee> Emp=er.saveAll(allemp);
	     Emp.forEach(e->{
	    	 System.out.println(e);
	     });
	  
	  // get data
	     Iterable<Employee> all = er.findAll();
			all.forEach(alll->{
				System.out.println(all);
			});
*/
	  // delete
	  /*
			er.deleteById(2);
			System.out.println("data delete");
			*/
	  /*
	  List<Employee> emp = er.findByEmailAndPassword("suman@gmail.com", "suman@123456");
	  System.out.println("Login Successfull...");
		*/
	  
	  List<Employee> alluser=er.getAllEmp();
	  alluser.forEach(e->{
		  System.out.println(e);
		  System.out.println("data fatch successfully...");
	  });
	  
	  
	  System.out.println("-------------------");
	    List<Employee> u=  er.getEmpByname("Aman kumar","aman1234");
	      u.forEach(e->{
	    	  System.out.println(e);
	    	  System.out.println("name fonund");
	      });
	  
	}

	
                  
}
