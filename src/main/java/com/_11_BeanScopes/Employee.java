package com._11_BeanScopes;

import java.beans.JavaBean;

import org.springframework.context.annotation.Scope;

//@Scope("singleton")
public class Employee {
	private String name;
	private String designation;

	// getter's & setter's
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}