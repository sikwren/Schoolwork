/*
 * Sydnee Wren
 * Due: July 17, 2015
 * 
 * NBA.java
 * This client program uses methods from the NBATeam.java class file.
 * Following the source code in the homework instructions, finish the
 * program. This program simulate a game between two "teams" in a series
 * 7 games. The program outputs who won the games (which is decided by 
 * a randomly generated number), each player on the teams, and the final
 * score of both teams.
 */
import java.util.Scanner;
import java.util.Random;

public class NBA{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//construct Heat team
		String ifAddPlayer, playerName;
		
		System.out.println("Creating the NBA Team Heats ....");
		NBATeam heats = new NBATeam("Heats");
		
		System.out.print("Add a player to Heats? (Yes/No): ");
		ifAddPlayer = in.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName = in.next();
			heats.addPlayer(playerName);
			
			System.out.print("Add one more players? (Yes/no): ");
			ifAddPlayer = in.next();
		}
		
		//construct Spurs team
		System.out.println("Creating the NBA Team Spurs ....");
		NBATeam spurs = new NBATeam("Spurs");
		
		System.out.print("Add a player to Spurs? (Yes/No): ");
		ifAddPlayer = in.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName = in.next();
			spurs.addPlayer(playerName);
			
			System.out.print("Add one more players?(Yes/no): ");
			ifAddPlayer = in.next();
		}
		
		letsPlay(heats, spurs);
		
		in.close();
	}
	public static void letsPlay(NBATeam heats, NBATeam spurs){
		Random rand = new Random();
		double outcome;
	
		System.out.println("\nLets play some ball!");
		for (int i = 0; i < 7; i++){
			outcome = rand.nextDouble();
			
			if (outcome < 0.5){
				spurs.winAGame(heats);
			} else {
				heats.winAGame(spurs);
			}
			
			if (heats.nWin() == 4 || spurs.nWin() == 4){
				break;
			}
		}
		
		if (heats.nWin() > spurs.nWin()){
			System.out.println("Heats ***WIN the series***");
		} else {
			System.out.println("Spurs ***WIN the series***");
		}
		
		System.out.println(heats);
		System.out.println(spurs);
		
	}

}
