package model;

public class Yard extends Player{
private int passes;
private int recoveries;
private String nameFormation;
private String dateFormation;

public Yard(int shirt) {
	super(shirt);
	
}
 public Yard() {}
public int getPasses() {
	return passes;
}
public void setPasses(int passes) {
	this.passes = passes;
}
public int getRecoveries() {
	return recoveries;
}
public void setRecoveries(int recoveries) {
	this.recoveries = recoveries;
}
 public void darPasses() {
	 setPasses(getPasses()+1);
 }
 public void recover() {
	 setRecoveries(getRecoveries()+1);
	 	 
	 
 }
public String getNameFormation() {
	return nameFormation;
}
public void setNameFormation(String nameFormation) {
	this.nameFormation = nameFormation;
}
public String getDateFormation() {
	return dateFormation;
}
public void setDateFormation(String dateFormation) {
	this.dateFormation = dateFormation;
}
 }

