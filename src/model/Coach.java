package model;

public class Coach {
private static String name;
private int identifier;
private double salary;
private String state;
private int teamsManager;
private int cupsAdquired;
private String expertise;
private int playerTime;

public Coach(String name, int identifier) {
	Coach.name=name;
	this.identifier=identifier;
	
}
public Coach(){}

public void wonCup() {
	setCupsAdquired(getCupsAdquired()+1);
}

public double level() {
	return getCupsAdquired()+5;
}
public String getName() {
	return name;
}
public void setName(String name) {
	Coach.name = name;
}
public int getIdentifier() {
	return identifier;
}
public void setIdentifier(int identifier) {
	this.identifier = identifier;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getTeamsManager() {
	return teamsManager;
}
public void setTeamsManager(int teamsManager) {
	this.teamsManager = teamsManager;
}
public int getCupsAdquired() {
	return cupsAdquired;
}
public void setCupsAdquired(int cupsAdquired) {
	this.cupsAdquired = cupsAdquired;
}
public String getExpertise() {
	return expertise;
}
public void setExpertise(String expertise) {
	this.expertise = expertise;
}
public int getPlayerTime() {
	return playerTime;
}
public void setPlayerTime(int playerTime) {
	this.playerTime = playerTime;
}
}
