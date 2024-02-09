package com._7_standAlone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/_7_standAlone_collection/BeanConfig.xml");
		Person p = applicationContext.getBean(Person.class);
	
		System.out.println(p);
		System.out.println("Packege Name is :"+p.getFriends().getClass().getName());
		System.out.println("=======================================");
		System.out.println(p.getGoals());
		System.out.println("Packege Name is :"+p.getGoals().getClass().getName());

		System.out.println("=======================================");
		System.out.println(p.getDbconn());
		System.out.println("Packege Name is :"+p.getDbconn().getClass().getName());

		
	}
	

}
