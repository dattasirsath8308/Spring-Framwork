package com._1_JDBC_withXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/_1_JDBC_withXML/Beans.xml");
		JdbcTemplate jdbcTemplate = context.getBean("studentJDBCTemplate",JdbcTemplate.class);
		

		String sql = "Insert into Student(id,name,age) values (?,?,?)";

		int result = jdbcTemplate.update(sql,12,"Kale",21);
		System.out.println("Number of Record Inserted : "+result);
		
		
	}

}
