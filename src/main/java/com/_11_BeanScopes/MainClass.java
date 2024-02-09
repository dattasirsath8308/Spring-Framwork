package com._11_BeanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/_11_BeanScopes/BeanConfig.xml");

		// employee 1 - retrieve employee bean
		Employee employee1 = (Employee) applicationContext.getBean("employee");

		// setting values using employee1 bean
		employee1.setName("Ravi Raj");
		employee1.setDesignation("Technical Lead");

		// print values in console using employee1 bean
		System.out.println("\nPrinting values in console using employee1 bean");
		System.out.println("Name \t\t: " + employee1.getName());
		System.out.println("Designation \t: " + employee1.getDesignation());

		// employee 2 - retrieve again the same bean

		Employee employee2 = (Employee) applicationContext.getBean("employee");
		// print values in console using employee2 bean
		System.out.println("\n\nPrinting values in console using employee2 bean");
		System.out.println("Name \t\t: " + employee2.getName());
		System.out.println("Designation \t: " + employee2.getDesignation());
		System.out.println("employee1 hash Code : " + employee1.hashCode());
		System.out.println("employee2 hash Code : " + employee2.hashCode());
		System.out.println("Is Singleton Bean employee1 and singleton employee2 are same ? " + (employee1 == employee2));
	}
}