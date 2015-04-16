  //Sydnee Wren
//Homework #7

import java.util.Scanner;

public class Nutty_String {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String name = in.nextLine().toLowerCase();
	
		printReverse(name);
		printNickname(name);
		printPyramid(name);	
		
		in.close();
	}
	
	public static void printReverse(String name){
		String temp = "";
		for (int i = 0; i < name.length(); i++){
			temp = name.charAt(i) + temp;
		}
		System.out.println(temp);
	}

	public static void printNickname(String name){
		String str1 = name.substring(0,2);
		String str2 = name.substring(name.length()-2, name.length());
		System.out.println(str1 + str2);
	}
	
	public static void printPyramid(String name){
		for (int i = 0; i < name.length(); i++){
			for(int j = 0; j <= i; j++){
				System.out.print(name.charAt(i));
			}
			System.out.println("");
		}
	}
}
