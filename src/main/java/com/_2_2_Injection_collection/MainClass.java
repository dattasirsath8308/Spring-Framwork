package com._2_2_Injection_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/_2_2_Injection_collection/BeanConfig.xml");
		Player player = context.getBean(Player.class);
		
			
		
			System.out.println(player.getJNO()); 
			System.out.println(player.getPName()); 
			System.out.println(player.getROle()); 
			System.out.println(player.getAge()); 
			
			System.out.println(player);
	}

}
