
public class NBATeam {
	private int nWin;
	private int nLoss;
	private String name;
	
	//constructors
	public NBATeam(String teamName, int gameWin, int gameLoss){
		name = teamName;
		nWin = gameWin;
		nLoss = gameLoss;
	}
	public NBATeam(){
		name = "no name";
		nWin = 0;
		nLoss = 0;
	}
	
	//instance methods
	public void setName(String teamName){
		name = teamName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setWin (int win){
		nWin = win;
	}
	public int getLoss(){
		return nLoss;
	}
	public void setLoss(int loss){
		nLoss = loss;
	}
	public void winAGame(NBATeam teamB){
		nWin++;
		teamB.setLoss(teamB.getLoss()+1);
		
	}
	public String toString(){
		return name + ": Wins: " + nWin + "; Loses: " + nLoss;
	}
}
