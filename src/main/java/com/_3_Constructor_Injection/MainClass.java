package com._3_Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/_3_Constructor_Injection/BeanConfig.xml");
		Car c  = context.getBean(Car.class);
		c.start();
		
		System.out.println(c);
	}

}
