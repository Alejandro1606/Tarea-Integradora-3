package model;

import java.util.ArrayList;

public class Team {
private Goalkeeper goalkeeper;
private ArrayList<Defender>defenders;
private ArrayList<Forward>forwards;
private MainCoach maincoach;
private static CoachAssistent [] coachassistent;
public Team() {
	goalkeeper=new Goalkeeper();
	defenders=new ArrayList<Defender>();
	forwards=new ArrayList<Forward>();
}


	
	


public void addPlayer(Player j) {
	boolean find= false;
	if(goalkeeper.getShirt()==j.getShirt()) {
		find=true;
	}

for (Defender aux:defenders) {
	if(aux.getShirt()==j.getShirt()) {
		find=true;
		break;
	}
	
	}

for(Forward aux:forwards) {
	if(aux.getShirt()==j.getShirt()) {
		find=true;
		break;
	}
}
if (find==true) {
	System.out.println("The player already exist");
	}else {
		if(j instanceof Goalkeeper) {
			this.goalkeeper=(Goalkeeper)j;
		}

	if(j instanceof Defender) {
		if(defenders.size()<10) {
			defenders.add((Defender)j);
		}else {
			System.out.println("The defenders list are full");
		}
	}
	
	if(j instanceof Forward) {
		if(forwards.size()<10) {
			forwards.add((Forward)j);
		}else {
			System.out.println("The forwards list are full");
		}
	}
	
	}

}

public void addCoach(Coach j) {
	boolean find= false;
	if(maincoach.getName()==j.getName()) {
		find=true;
	}

for (Coach aux:coachassistent) {
	if(aux.getName()==j.getName()) {
		find=true;
		break;
	}
	
	}
if (find==true) {
	System.out.println("The coach already exist");
	}else {
		if(j instanceof MainCoach) {
			this.maincoach=(MainCoach)j;
		}
	}
}

public int teamInfo() {
	int addLevels=0;
	if(goalkeeper !=null&& defenders.size()==10&&forwards.size()==10) {
		addLevels+=goalkeeper.level();
		for(Defender aux:defenders) {
			addLevels+=aux.level();
		}
	
	for(Forward aux:forwards) {
		addLevels+=aux.level();
		
	}
	return addLevels;
	}else {
		System.out.println("Are players that arent added");
	return 0;
	
	}
	}
	public void addGoal(int shirt) {
		boolean score=false;
		if(goalkeeper!=null && goalkeeper.getShirt()==shirt) {
			goalkeeper.scoreGoal();
			System.out.println("The goalkeeper score a goal");
		score=true;

		}
		for(Defender aux:defenders) {
			if(aux.getShirt()==shirt) {
				aux.scoreGoal();
				System.out.println("The defender score a goal");
			    score=true;
			}
		}

	for(Forward aux: forwards) {
		if(aux.getShirt()==shirt) {
			aux.scoreGoal();
			System.out.println("The forward score a goal");
		  score=true;  
		}
	}
	if(score==false) {
		System.out.println("Player not found");
	}
	}
	public void addCup(String name) {
		boolean won=false;
		if(maincoach!=null && maincoach.getName()==name) {
			maincoach.wonCup();
			System.out.println("The Main coach won a cup");
		won=true;

		}
	
	if(won==false) {
		System.out.println("The Main coach dont won a cup");
	}
	}






	public void addDate(int date) {
		
		
	}






	public void addTactic(String nameFormation) {
		
		
	}






	public void addAlineation(int alineation) {

		
	}
	
	
	}
