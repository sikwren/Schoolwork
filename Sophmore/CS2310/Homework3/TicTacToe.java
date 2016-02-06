/*
 * Sydnee Wren
 * Due June 30, 2015
 * 
 * TicTacToe.java
 * Program plays through one game of Tic Tac Toe.
 */

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Player 1, please enter name: ");
		String player1 = in.next();
		System.out.println(player1 + " you are X's.");
		
		System.out.print("Player 2, please enter name: ");
		String player2 = in.next();
		System.out.println(player2 + " you are O's");
		
		
		playGame (in, player1, player2);
		
		in.close();
	} //end main
	
	public static void playGame(Scanner in, String player1, String player2){
		String[][] board =  new String[3][3];
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				board[i][j] = "_";
			}
		}
		printBoard(board);
		move(in, player1, player2, board);
		
	}
	
	public static void printBoard(String[][] board){		//method prints board with current tic and tacs
		System.out.println("\n The current board: \n");
		System.out.println("\t" + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("\t" + "--+---+--");
		System.out.println("\t" + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("\t" + "--+---+--");
		System.out.println("\t" + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
	}
	
	public static void move(Scanner in, String player1, String player2, String [][]board){ //controls "turns", makes mark, and checks for winner
		int row = 0, column = 0;
		String mark = null;
		int turn = 0;

		do{
			if (turn % 2 != 0){
				mark = "X";
				System.out.print(player1);

			} 
			if (turn % 2 == 0){
				mark = "O";
				System.out.print(player2);	
			}
			turn++;
			
			System.out.print(", please enter your coordination (row column): ");
			row = in.nextInt();
			column = in.nextInt();
			makeMark(in, board, row, column, mark, turn);
			isWin (board, turn);
		}while (!isWin(board,turn));
		
	}
	public static void makeMark (Scanner in, String[][] board, int row, int column, String mark, int turn){ //makes X or O on board, prints board
		if(board [row][column].equals("X") || board [row][column].equals("O")){
			System.out.print("Sorry! This space already has a mark in it! Please try again: ");
			row = in.nextInt();
			column = in.nextInt();
			board[row][column] = mark;
		}
		if (board [row][column].equals("_")){
			board[row][column] = mark;
		}

		printBoard(board);	
			
	}
	public static boolean isWin(String[][] board, int turn){ //checks for wins, ends game if winner is found.
		if ( board[0][0] == "X" &&  board[0][1] == "X" && board[0][2] == "X"){
			System.out.println("Congradulations! X's won!");
			return true;
		} if ( board[1][0] == "X" &&  board[1][1] == "X" && board[1][2] == "X"){
			System.out.println("Congradulations! X's won!");
			return true;
		}if ( board[2][0] == "X" &&  board[2][1] == "X" && board[2][2] == "X"){
			System.out.println("Congratulations! X's won!");
			return true;
		}
		
		if ( board[0][0] == "O" &&  board[0][1] == "O" && board[0][2] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
		} if ( board[1][0] == "O" &&  board[1][1] == "O" && board[1][2] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
		}if ( board[2][0] == "O" &&  board[2][1] == "O" && board[2][2] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
		
		}
		if ( board[0][0] == "X" &&  board[1][0] == "X" && board[2][0] == "X"){
			System.out.println("Congradulations! X's won!");
			return true;
		} if ( board[0][1] == "X" &&  board[1][1] == "X" && board[2][1] == "X"){
			System.out.println("Congradulations! X's won!");
			return true;
		}if ( board[0][2] == "X" &&  board[1][2] == "X" && board[2][2] == "X"){
			System.out.println("Congradulations! X's won!");
			return true;
		}
		if ( board[0][0] == "O" &&  board[1][0] == "O" && board[0][2] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
		} if ( board[0][1] == "O" &&  board[1][1] == "O" && board[2][1] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
		}if ( board[0][2] == "O" &&  board[1][2] == "O" && board[2][2] == "O"){
			System.out.println("Congradulations! O's won!");
			return true;
			
		} 
		if ( board[0][0] == "X" &&  board[1][1] == "X" && board[2][2] == "X"){
			System.out.println("Congradulations! X's won");
			return true;
		}if ( board[0][0] == "O" &&  board[1][1] == "O" && board[2][2] == "O"){
			System.out.println("Congradulations! O's won");
			return true;
		} if ( board[0][2] == "X" &&  board[1][1] == "X" && board[2][0] == "X"){
			System.out.println("Congradulations! X's won");
			return true;
		} if ( board[0][2] == "O" &&  board[1][1] == "O" && board[2][0] == "O"){
			System.out.println("Congradulations! O's won");
			return true;
		}if (turn == 9){
			System.out.println ("That's a draw!");
			return true;
		}
		return false; 
		
	}

}

