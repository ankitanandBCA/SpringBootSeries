package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class App {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");
       AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(AppConfig.class);
      // Add dependency         
       Emp emp=(Emp) ann.getBean("emp");
       emp.setName("ram");
       System.out.println(emp.getName());
    
    }
}
