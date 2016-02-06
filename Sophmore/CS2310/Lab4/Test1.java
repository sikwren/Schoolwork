import java.util.Random;
import java.util.Scanner;


public class Test1{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Number of rows: ");
		int rows = in.nextInt();
		System.out.print("Number of columns: ");
		int columns = in.nextInt();
		
		while (columns > 8){
			System.out.print("Number of columns to large. Please try again: ");
			columns = in.nextInt();
		}
		
		double [][] m = new double [rows][columns];
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				m[i][j] = rand.nextDouble() * 7.0 + 4.0;
				System.out.printf("    %4f\t", (m [i][j]));
			}
			System.out.println();
		}

		findMaxCol(m);
		System.out.println("Average: " + returnAvg(m)/ (rows * columns));
		
		in.close();
	}
	
	public static void findMaxCol(double [][] m){
		double columnSum = 0;
		double max = 0;
		
		for (int i = 0; i < m[1].length; i++){		
			for (int j = 0; j < m.length; j++){
				columnSum += m[j][i];
			}
			if (columnSum > max){
				max = columnSum;
			}
			columnSum = 0;
		}
		System.out.println("Largest sum of column: " + max);
		
	}
	public static double returnAvg(double[][] m){
		double sum = 0;
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				sum += m[i][j];
			}
		}
		return sum;
	}

}
