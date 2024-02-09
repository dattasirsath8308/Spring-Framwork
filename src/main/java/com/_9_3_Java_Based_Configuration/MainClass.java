package com._9_3_Java_Based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);

        // Get the bean from the context
        Student student = applicationContext.getBean(Student.class);

        // Use the student bean
        System.out.println("Student Roll No: " + student.getRollNO());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Detail: " + student);

        

	}

}
