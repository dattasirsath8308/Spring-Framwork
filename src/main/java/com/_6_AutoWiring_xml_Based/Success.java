package com._6_AutoWiring_xml_Based;

public class Success {

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
		System.out.println("getMethod");
		return dedication;
	}

	public void setDedication(Dedication dedication) {
		this.dedication = dedication;
	}

	@Override
	public String toString() {
		return "Success [dedication=" + dedication + "]";
	}
	
	
	
	
}
