package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
       Emp empp=(Emp)applicationContext.getBean("emp");
        System.out.println(empp.getName());
       // System.out.println("Spring context loaded successfully.");
        applicationContext.registerShutdownHook();
    }
}
