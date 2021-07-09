package com.qa.springspurs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spurs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 

	private Long id; 
	private String name;
	private int shirtNumber;
	private String position;
	private int apps;
	private int goals;

	public Spurs() {
	}

	public Spurs(String name, int shirtNumber, String position, int apps, int goals) {
		this.name = name;
		this.shirtNumber = shirtNumber;
		this.position = position;
		this.apps = apps;
		this.goals = goals;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getApps() {
		return apps;
	}

	public void setApps(int apps) {
		this.apps = apps;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

}
