package com._9_1_xml_Based_Configuration;

public class Student {

	private int RollNO;
	private String Name;
	
	
	public int getRollNO() {
		return RollNO;
	}
	public void setRollNO(int rollNO) {
		RollNO = rollNO;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [RollNO=" + RollNO + ", Name=" + Name + "]";
	}
	
	
	
}
