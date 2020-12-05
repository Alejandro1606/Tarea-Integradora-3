package model;

public class MainCoach extends Coach{
	public MainCoach(String name, int identifier ) {
		super(name, identifier);
}

	public MainCoach() {}
	@Override
	public double level() {
		return super.level()+getCupsAdquired()/10;
	}
	}