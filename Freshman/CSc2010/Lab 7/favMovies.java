import java.util.Scanner;

public class favMovies {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 
	 String allMovies = " ";
	 
	 for (int i = 1; i <=10 ; i++){
		 System.out.println("What's your favorite movie?");
		 String temp = in.nextLine();
		 allMovies += temp + "\t";
	 }
	 System.out.println(allMovies);

	 in.close();
	}

}
