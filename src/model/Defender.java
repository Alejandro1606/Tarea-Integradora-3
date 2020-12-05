package model;

public class Defender extends Yard {
	public Defender(int shirt) {
		super(shirt);
		
	}
public Defender () {}

@Override
public double level() {
	return super.level()+getCalification()+ getGoals()/100;
}
}