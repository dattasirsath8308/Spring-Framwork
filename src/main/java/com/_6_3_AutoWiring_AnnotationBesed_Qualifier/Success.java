package com._6_3_AutoWiring_AnnotationBesed_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Success {

	
// We can Autowired property(Variables) , Setter Method , Constructor
	
	@Autowired
	@Qualifier("ded2")
	private Dedication dedication;

	public Success() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	
	public Success(Dedication dedication) {
		super();
		this.dedication = dedication;
		System.out.println("Constructor Callig by autowire type ");
	}

	public Dedication getDedication() {
		return dedication;
	}

//	@Autowired
	public void setDedication(Dedication dedication) {
		System.out.println("Setting Value ");
		this.dedication = dedication;
	}

	@Override
	public String toString() {
		return "Success [dedication=" + dedication + "]";
	}
	
	
	
	
}
