package com._2_2_Injection_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Player {

	private List<Integer> JNO;
	private Set<String> PName;
	private Map<Integer,String > ROle;
	private Properties Age;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(List<Integer> jNO, Set<String> pName, Map<Integer, String> rOle, Properties age) {
		super();
		JNO = jNO;
		PName = pName;
		ROle = rOle;
		Age = age;
	}


	public List<Integer> getJNO() {
		return JNO;
	}


	public void setJNO(List<Integer> jNO) {
		JNO = jNO;
	}


	public Set<String> getPName() {
		return PName;
	}


	public void setPName(Set<String> pName) {
		PName = pName;
	}


	public Map<Integer, String> getROle() {
		return ROle;
	}


	public void setROle(Map<Integer, String> rOle) {
		ROle = rOle;
	}


	public Properties getAge() {
		return Age;
	}


	public void setAge(Properties age) {
		Age = age;
	}


	@Override
	public String toString() {
		return "Player [JNO=" + JNO + ", PName=" + PName + ", ROle=" + ROle + ", Age=" + Age + "]";
	}
	
		

}
