


package ui;

import java.util.Scanner;

import model.Coach;
import model.Defender;
import model.Forward;
import model.Goalkeeper;
import model.MainCoach;
import model.Player;
import model.Team;
import model.CoachAssistent;
import model.Yard;
@SuppressWarnings("unused")
public class Main {

public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sr=new Scanner(System.in);
	Team e=new Team();
	System.out.println("Team");
	System.out.println("Options Menu:");
	int option=0, tp=0;
	int opt=0, tc=0;
	do {
		System.out.println("Enter the option: 1)Add player 2:Team information view 3:Add goal 4:Add coach 5:Add cup 6:Add formation 7:Exit");
		option=Integer.parseInt(sr.nextLine());
		switch(option) {
		case 1:System.out.println("Players entry");
		 Player j=new Player();
		do {
			System.out.println("Enter the type of player 1:Goalkeeper 2:Defender 3:Forward");
		tp=Integer.parseInt(sr.nextLine());
		switch(tp) {
		case 1: j=new Goalkeeper();
		break;
		case 2: j=new Defender();
		break;
		case 3:j=new Forward();
		break;
		default:System.out.println("Enter a valid option");
		}
		
		}while(tp<1|| tp>3);
		System.out.println("Enter the number of shirt");
		int shirt=Integer.parseInt(sr.nextLine());
		j.setShirt(shirt);
		e.addPlayer(j);
		break;
		case 2:
			System.out.println("Team information"+ e.teamInfo());
			System.out.println("The team information is:");
			break;
		case 3:System.out.println("Add a goal");
		System.out.println("Enter the shirt of the player");
		int shirtGoal= Integer.parseInt(sr.nextLine());
		e.addGoal(shirtGoal);
		break;
		
		case 4: Coach c=new Coach();
		do {
		System.out.println("Enter the type of coach 1:Main coach 2:Coach Assistent");
		tc=Integer.parseInt(sr.nextLine());
	
		switch(tc) {
		case 1: c=new MainCoach();
		break;
		case 2: c=new CoachAssistent();
		break;
		default:System.out.println("Enter a valid option");
		}
		}while(tp<1|| tp>2);
		System.out.println("Enter the name of the coach");
		String name= sr.nextLine();
		c.setName(name);
		e.addCoach(c);
		break;
		case 5:System.out.println("Add a cup");
		System.out.println("Enter the name of the coach");
		String name2=sr.nextLine();
		e.addCup(name2);
		break;
		case 6:System.out.println("Add a formation");
		System.out.println("Enter the date of the formation");
		int date=Integer.parseInt(sr.nextLine());
		e.addDate(date);
		System.out.println("Enter the tactic");
		String nameFormation=sr.nextLine();
		e.addTactic(nameFormation);
		System.out.println("Enter the alineation");
		int alineation=Integer.parseInt(sr.nextLine());
	    e.addAlineation(alineation);
	    break;
		case 7: System.out.println("Exit");
		break;
		default:System.out.println("Enter a valid option (1-6)");
		
		}
	} while(option!=7);
	
	}
	
	
	
	
	
	
}



