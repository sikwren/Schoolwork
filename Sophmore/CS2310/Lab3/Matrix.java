import java.util.Random;

public class Matrix {
	public static void main(String[] args) {
		
		int [][] a = new int [3][4];
		int [][] b = new int [4][2];
		
		fill(a);
		fill(b);
	}
	
	public static int[][] matrixProduct(int [][] a, int [][] b){
		int [][] c = new int [3][2];
		
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				for (int k = 0; k < b.length ;k++){
					c[i][j] = a[i][j] * b[i][j]; 
				}
			}
		}
		return c;
	}
	
	public static void fill(int [][] array){
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array [i][j] = rand.nextInt(9)+1;
			}
		System.out.println();
		}
		
	}

}
