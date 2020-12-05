package model;

public class Goalkeeper extends Player {
private int tackle;
public Goalkeeper(int shirt) {
	super(shirt);
}
public Goalkeeper() {}
public void doTackle() {
	setTackle(getTackle()+1);
	}
public int getTackle() {
	return tackle;
}
public void setTackle(int tackle) {
	this.tackle = tackle;
}
@Override
public double level() {
	return super.level()+getTackle()*5;
}
}