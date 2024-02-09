package com._1_JDBC_withXML;

public class Student {

	private Integer age;
	private String name;
	private Integer id;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}

/*
 * Query :
 * 
 * CREATE TABLE Student( ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(20) NOT
   NULL, AGE INT NOT NULL, PRIMARY KEY (ID) );
 * 
 * 
 */