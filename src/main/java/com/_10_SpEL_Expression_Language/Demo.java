package com._10_SpEL_Expression_Language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{10+20}")
	private int X;
	
	@Value("#{20+20}")
	private int Y;
	
	
//	Passing the Static Method to expression
	@Value("#{ T(java.lang.Math).sqrt(25)  }")
	private int zz;
	
	@Value("#{ T(java.lang.Math).PI  }")
	private int pi;
	
	
//	Passing the Object
	@Value("#{ new java.lang.String('Shri Shri  Datta G')}")
	private String name;
	
	
//	Passing Boolean  Expression
	@Value("#{10 > 5}")
	private boolean isAlive;
	
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	
	public int getZz() {
		return zz;
	}
	public void setZz(int zz) {
		this.zz = zz;
	}
	@Override
	public String toString() {
		return "Demo [X=" + X + ", Y=" + Y + ", zz=" + zz + ", pi=" + pi + ", name=" + name + ", isAlive=" + isAlive
				+ "]";
	}
	
	
	

}
