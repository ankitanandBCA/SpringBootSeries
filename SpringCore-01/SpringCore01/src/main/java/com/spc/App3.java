package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
       Car carr=(Car)applicationContext.getBean("car");
        System.out.println(carr);
       // System.out.println(student);
  
    }
}
