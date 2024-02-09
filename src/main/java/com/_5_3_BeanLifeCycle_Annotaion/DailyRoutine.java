package com._5_3_BeanLifeCycle_Annotaion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DailyRoutine {

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
	

	
//	init() Method : Initailization
	
	@PostConstruct
	public void Morning()
	{
		System.out.println("Start the Day & Wake up 10 AM ");
	}
	
	
//	Destroy() Method : Destroy call before program Execution
	@PreDestroy
	public void Night()
	{
		System.out.println("End the Day & going to bed 1 AM ");
	}
	
	
/*
 *
 * Add dependency
 *  <!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>

*/ 
	
	
	
}
