package com._9_2_xml_Annotation_Based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		/* 
		
//		1. Xml Annotation Configutation Check XML file 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/_9_2_xml_Annotation_Based_Configuration/Bean.xml");
		Student s = context.getBean(Student.class);
		System.out.println(s.getRollNO());
		System.out.println(s.getName());
		System.out.println(s);

		
		*/
		
//		2. Java Class Based Configuration
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the bean from the context
        Student student = context.getBean(Student.class);

        // Use the student bean
        System.out.println("Student Roll No: " + student.getRollNO());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Detail: " + student);
        // Close the context
        context.close();
		
		
		
		

	}

}
