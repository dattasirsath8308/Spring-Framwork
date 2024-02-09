package com._7_standAlone_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	public List<String> friends;
	public Map<String, Integer> goals;
	public Properties dbconn;

	public Properties getDbconn() {
		return dbconn;
	}

	public void setDbconn(Properties dbconn) {
		this.dbconn = dbconn;
	}

	public Map<String, Integer> getGoals() {
		return goals;
	}

	public void setGoals(Map<String, Integer> goals) {
		this.goals = goals;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", goals=" + goals + "]";
	}

	
	
}
