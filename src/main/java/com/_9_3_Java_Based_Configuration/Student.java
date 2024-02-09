package com._9_3_Java_Based_Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {

	@Value("11")
	private int RollNO;
	
	@Value("Datta")
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
