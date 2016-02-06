/*
 * Sydnee Wren
 * Due: July 17, 2015
 * 
 * NBATeam.java
 * 
 * This is the class file that is used in the NBA class file.
 * This class includes the field variables for keep track of
 * the numbers of wins, losses, and names of players for each
 * instance of the class.
 */
import java.util.Arrays;

public class NBATeam {
	private String teamName;
	private int nWin;
	private int nLoss;
	private int numPlayer;
	
	private String [] playerArray = new String [numPlayer];
	
	//constructors
	public NBATeam(String teamName){
		this.teamName = teamName;
	}
	
	//instance methods
	public int nWin(){
		//returns number of wins
		return nWin;
	}
	public int nLoss(){
		//returns number of loss
		return nLoss;
	}
	public String getTeamName(){		
		//gets team's Name
		return teamName;
	}
	
	public void setWin(int win){	
		//adds to nWin if game is won
		nWin = win;
	}
	public void setLoss(int loss){
		//adds nLoss if game is lost
		nLoss = loss;
	}
	
	public void winAGame(NBATeam team2){
		//stimulate the playing of a game
		nWin++;
		team2.setLoss(team2.nLoss()+1);
	}
	
	public void addPlayer(String player){	
		String temp[] = playerArray;
		playerArray = Arrays.copyOf(temp, temp.length + 1);
		playerArray[numPlayer] = player;
		numPlayer++;
	}
	
	public String toString(){		
		//prints final status game
		return teamName + Arrays.toString(playerArray)+ "Wins: " + nWin + 
				" Loses: " + nLoss;
	}
	
}
