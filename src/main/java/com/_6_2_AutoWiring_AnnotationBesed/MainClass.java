package com._6_2_AutoWiring_AnnotationBesed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/_6_2_AutoWiring_AnnotationBesed/BeanConfig.xml");
		Success success = applicationContext.getBean(Success.class);
	
		System.out.println(success);
	
	}
	

}
