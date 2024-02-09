package com._8_Sterotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/_8_Sterotype_Annotation/Sterotype_Bean.xml");

//		Student student = context.getBean("student",Student.class);
//		Student student = context.getBean("cobj",Student.class);
		Student student = context.getBean(Student.class);
		
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());


//		singleton : same object prototype : difference object 
		System.out.println("After Changing Scope of Bean");
		Student student1 = context.getBean("cobj",Student.class);
		
		
		System.out.println("hashcode of student object :  "+student.hashCode());
		System.out.println("hashcode of student1 object :  "+student1.hashCode());
		

		
		
	}

}
