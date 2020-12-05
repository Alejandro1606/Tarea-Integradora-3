package model;

public class Forward extends Yard {
public Forward(int shirt) {
	super(shirt);
}
public Forward(){}

@Override
public double level() {
	return super.level()+ super.getPasses()*2+(super.getRecoveries()*3);
}
}