/**
 		Sydnee Wren
 		Assignment #2: Wordcount.java
 		Due Wednesday, February 3, 2016
 		
 		Purpose:
 			This program will take in a text file, with a prompt for user
 			input and then return some information in both a print out to
 			the console and as a output text file. The program will print
 			out the amount of words in the file (as defined by a space, a 
 			end of line character or a punctuation mark), the amount of 
 			lines in the file, the amount of alphanumeric (a-z, A-Z, 0-9) 
 			characters in the file, the number of sentences in the file (as
 			defined by an end of line punctuation), the number of vowels 
 			(a, e, i, o, u; both upper and lower case), and then the amount
 			of punctuation in the file. The program must work even if file 
 			is empty.
 		
 		Solution and Algorithms:
 			First thing that needs to be done is to actually take in the the
 			user's file, which was done with a Scanner object. The file was
 			then passed to the getFileInfo method (still within the main 
 			method) call. If there is no file found, the program will through
 			an exception and will terminate. After that the program uses a 
 			try-catch block to place the user inputed file into File object. 
 			The new file object is the checked if the file is empty. If the file 
 			is empty, then the program prints "Input File is empty" and the program is 
 			terminated. If the file is not empty, then the program enters a 
 			while loop, which counts the number of lines (defined by how many
 			times input scanner has to fetch a new line), the number of words
 			(counted with a StringTokenizer, using spaces) and the number of 
 			characters within each line. There is then a for loop which counts
 			the characters match a series of characters in an if statement to 
 			get the number of sentences, vowels, and punctuation marks within
 			the file. After that information is counted up, it will be printed
 			to the screen. Then it will be printed to an output.txt file, which 
 			is stored in the same folder as the source code, with an PrintWriter
 			object. If there is already a file that is name output.txt, then it 
 			is overridden with the new information. The program terminatesIf the 
 			file cannot be written then an exception is thrown, and the program 
 			terminates. 
 						
 		Data Structures:
 			None
 		
 		Expected Input/Output:
 			The expected input is a text file (.txt) pathway, which is provided by
 			the user of the program. The expected output of the program is
 			both a text file(.txt) and a printed out put to the screen which
 			will include the amount of words, lines, alphanumeric characters,
 			vowels, and punctuation in the user provided input (which is a 
 			text file). If file is empty then the output file, and screen out
 			put must read "the input file is empty".
 		
 **/

import java.util.*;
import java.io.*;

public class wordcount {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("File to be read path's: ");
		String fileName = input.nextLine();
		
		getFileInfo(fileName, input);
		input.close();
	} //end of main
	
	/*Takes in user input of for file location, finds all counts, and then
	 * prints out counts to screen, and to file. Which is stored in the same 
	 * folder as the project.*/
	public static void getFileInfo(String fileName, Scanner input) {
		int words = 0;
		int lines = 0;
		int alphachars = 0;
		int sentences = 0;
		int vowels = 0;
		int punctuation = 0;

		File inFile = new File(fileName);
		try {
			input = new Scanner(inFile);
			if (!input.hasNext()){				//print if file is empty
				System.out.println("Input file is empty");
			}
			while(input.hasNextLine()){
				lines++; 						//counts number of lines	
				String line = input.nextLine();
				words += new StringTokenizer(line, " ").countTokens(); //counts number of words
				alphachars += line.length();						 	// counts number of chars
				for (int i = 0; i < line.length(); i++){
					char c = line.charAt(i);
					 if (c == '.' || c == '!' || c == '?'){				//counts number of sentences
						 sentences++;
					 }
					 if ((c == 'a') || (c == 'e') || (c == 'i')|| (c == 'o') || (c == 'u')||
						(c == 'A') || (c == 'E') || (c == 'I')|| (c == 'O') || (c == 'U')){ //counts number of vowels
	                        vowels++;
					 }
					 if (c == '.' || c == '!' || c == '?' || c == '/'|| c == ';'|| c == ':'){ //counts number of punctuation marks
						 punctuation++;
					 }
				}
			}
			input.close();
		} catch (FileNotFoundException e){
			System.out.println(e + "\n File not found.");
			System.exit(1);
		}
		
		System.out.println("Number of words: " + words);
		System.out.println("Number of lines: " + lines);
		System.out.println("Number of alphanumeric characters : " + alphachars);
		System.out.println("Number of sentences: " + sentences);
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of puncuation marks: " + punctuation);
		
		PrintWriter output = null;
		try{
			output = new PrintWriter(new FileWriter("output.txt", false));
			output.println("Number of words: " + words);
			output.println("Number of lines: " + lines);
			output.println("Number of alphanumeric characters : " + alphachars);
			output.println("Number of sentences: " + sentences);
			output.println("Number of vowels: " + vowels);
			output.println("Number of puncuation marks: " + punctuation);
		}catch (IOException e){
			System.out.println(e);
		} finally {
			output.close();
		}
	} //end of getFileInfo method 
}
