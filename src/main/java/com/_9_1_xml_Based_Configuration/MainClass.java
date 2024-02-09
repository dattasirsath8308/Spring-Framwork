package com._9_1_xml_Based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/_9_1_xml_Based_Configuration/Bean.xml");
		Student s = context.getBean(Student.class);

		System.out.println(s.getRollNO());
		System.out.println(s.getName());
		
		System.out.println(s);

	}

}
