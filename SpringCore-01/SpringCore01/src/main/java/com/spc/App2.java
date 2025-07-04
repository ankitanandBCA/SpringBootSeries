package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
       Student student=(Student)applicationContext.getBean("stu");
        System.out.println(student);
        System.out.println(student);
  
    }
}
