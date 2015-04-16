//Sydnee Wren
//Lab #9

import java.util.Scanner;

public class NameString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = in.nextLine().trim();
		
		changeNameFormat(fullName);
		
		in.close();
	}
	
	public static void changeNameFormat(String fullName){
		int spaceIndex = fullName.indexOf(" ");
		
		String strl = fullName.substring(0, spaceIndex);
		String str2 = fullName.substring(spaceIndex + 1);
		
		System.out.println(str2 + ", " + strl);		
	}

}
