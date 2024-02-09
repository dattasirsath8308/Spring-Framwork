package com._4_Ambiguity_Cons_Overloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/_4_Ambiguity_Cons_Overloading/BeanConfig.xml");
		Addition a  = context.getBean(Addition.class);
		
		a.DisplaySum();
		
	}

}
