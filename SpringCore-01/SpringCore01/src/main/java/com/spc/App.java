package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee empp=(Employee)applicationContext.getBean("emp");
        System.out.println(empp);
        System.out.println("Spring context loaded successfully.");
    }
}
