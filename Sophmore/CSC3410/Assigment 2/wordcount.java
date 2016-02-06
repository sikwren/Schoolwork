
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
