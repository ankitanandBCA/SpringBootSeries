package com.spc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
    public static void main(String[] args) {
        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");
       
    }
}
