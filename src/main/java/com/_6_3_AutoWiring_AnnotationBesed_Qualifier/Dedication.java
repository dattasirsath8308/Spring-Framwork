package com._6_3_AutoWiring_AnnotationBesed_Qualifier;

public class Dedication {
	
	private String Hardwork;
	private String continuity;
	private String Sometimeluck;
	
	
	public Dedication() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dedication(String hardwork, String continuity, String sometimeluck) {
		super();
		Hardwork = hardwork;
		this.continuity = continuity;
		Sometimeluck = sometimeluck;
	}


	public String getHardwork() {
		return Hardwork;
	}


	public void setHardwork(String hardwork) {
		Hardwork = hardwork;
	}


	public String getContinuity() {
		return continuity;
	}


	public void setContinuity(String continuity) {
		this.continuity = continuity;
	}


	public String getSometimeluck() {
		return Sometimeluck;
	}


	public void setSometimeluck(String sometimeluck) {
		Sometimeluck = sometimeluck;
	}


	@Override
	public String toString() {
		return "Dedication [Hardwork=" + Hardwork + ", continuity=" + continuity + ", Sometimeluck=" + Sometimeluck
				+ "]";
	}
	
	
	

}
