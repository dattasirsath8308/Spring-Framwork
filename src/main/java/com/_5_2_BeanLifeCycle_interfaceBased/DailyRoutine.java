package com._5_2_BeanLifeCycle_interfaceBased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DailyRoutine implements InitializingBean,DisposableBean {

	private String Name ;

	public DailyRoutine(String name) {
		super();
		System.out.println("This is Parameterized Constructor ");
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

	public DailyRoutine() {
		super();
		System.out.println("This is Default Constructor ");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "All  DailyRoutine Between Morning to Night of Name=" + Name + "";
	}
	
	
	
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Start the Day & Wake up 10 AM ");
	
	
}

@Override
public void destroy() throws Exception {
	System.out.println("End the Day & going to bed 1 AM ");

}
	

/*
	
//	init() Method : Initailization
	public void Morning()
	{
		System.out.println("Start the Day & Wake up 10 AM ");
	}
	
	
//	Destroy() Method : Destroy call before program Execution
	public void Night()
	{
		System.out.println("End the Day & going to bed 1 AM ");
	}
 */
	
	
	
	
	
}
