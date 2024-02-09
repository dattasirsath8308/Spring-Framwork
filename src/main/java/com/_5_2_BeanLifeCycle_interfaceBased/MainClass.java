package com._5_2_BeanLifeCycle_interfaceBased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {

		
		
	    AbstractApplicationContext context 	= new ClassPathXmlApplicationContext("com/_5_2_BeanLifeCycle_interfaceBased/BeanConfig.xml");
//		DailyRoutine dr = (DailyRoutine) context.getBean("routine");
		

//	    calling init() 
	    DailyRoutine dr = context.getBean(DailyRoutine.class);
		
//		calling  other method between init() to destroy()
		System.out.println(dr);
		
		
//		calling destroy
		context.registerShutdownHook();
		

	}

}
