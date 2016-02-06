//Sydnee Wren
//Lab 5

public class Lab5 {
	public static void main(String[]args){
		NBATeam teamA = new NBATeam();
		NBATeam teamB = new NBATeam("Team B", 6, 3);
		
		teamA.setName("Team A");
		teamA.setWin(10);
		teamA.setLoss(4);
		
		teamA.winAGame(teamB);
		
		System.out.println(teamA);
		System.out.println(teamB);
	}

}
