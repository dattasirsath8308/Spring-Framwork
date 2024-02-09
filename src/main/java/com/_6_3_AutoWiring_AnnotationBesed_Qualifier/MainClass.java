package com._6_3_AutoWiring_AnnotationBesed_Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/_6_3_AutoWiring_AnnotationBesed_Qualifier/BeanConfig.xml");
		Success success = applicationContext.getBean(Success.class);
	
		System.out.println(success);
	
	}
	

}
