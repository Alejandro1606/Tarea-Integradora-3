package model;

public class Player {
private int shirt;
private int goals;
private int calification;
private int position;
private int level;

public Player(int shirt) {
	this.shirt=shirt;
	
}
public Player() {}

public void scoreGoal() {
	setGoals(getGoals()+1);
}
public double level() {
	return getCalification()*0.9;
}
public int getShirt() {
	return shirt;
}
public void setShirt(int shirt) {
	this.shirt = shirt;
}
public int getGoals() {
	return goals;
}
public void setGoals(int goals) {
	this.goals = goals;
}
public int getCalification() {
	return calification;
}
public void setCalification(int calification) {
	this.calification = calification;
}
public int getPosition() {
	return position;
}
public void setPosition(int position) {
	this.position = position;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
this.level=level;
}
}
