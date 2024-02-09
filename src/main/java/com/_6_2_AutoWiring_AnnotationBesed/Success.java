package com._6_2_AutoWiring_AnnotationBesed;

import org.springframework.beans.factory.annotation.Autowired;

public class Success {

	
// We can Autowired property(Variables) , Setter Method , Constructor
	
//	@Autowired
	private Dedication dedication;

	public Success() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	
	@Autowired
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
